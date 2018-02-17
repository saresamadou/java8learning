package fr.sare.java.threads;

import fr.sare.java.utils.LoggerTechnique;
import org.junit.Before;
import org.junit.Test;

/**
 * Class to test thread
 */
public class ThreadTest {


    private Runnable raceConditionRunnable;
    private LongWrapper longWrapper;
    private static long DEFAULT_LONG_WRAPPER_VALUE = 0L;


    @Before
    public void beforeTest() {
        longWrapper = new LongWrapper(DEFAULT_LONG_WRAPPER_VALUE);
        raceConditionRunnable =   () -> {
            for(int i = 0; i <1_000; i++) {
                longWrapper.incrementValue();
            }
        };
    }

    @Test
    public void threadShouldBeRunnable() {
        //GIVEN
        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            LoggerTechnique.LogInfo("Current thread is " + name);
        };

        Thread thread = new Thread(runnable);
        //WHEN
        thread.start();

        //THEN
    }

    @Test
    public void shouldLaunchTask() {
        //GIVEN
        Runnable runnable = () -> {
          System.out.print("Im a running in " + Thread.currentThread().getName());
        };
        //WHEN
        Thread myTaskThread = new Thread(runnable);
        myTaskThread.setName("My task thread");
        myTaskThread.start();
    }

    @Test
    public void shouldCreateRaceCondition() throws InterruptedException {
        Thread thread = new Thread(raceConditionRunnable);
        thread.start();

        thread.join();//To be sure that the following code executed once the previous thread finished

        LoggerTechnique.LogInfo("Value " + longWrapper.getValue());
    }

    @Test
    public void shouldNotRetunSameValueForEachExecution() throws InterruptedException {//LongWrapper without key object
        Thread[] threads = new Thread[1_000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(raceConditionRunnable);
            threads[i].start();
        }

        for(int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        LoggerTechnique.LogInfo("Value " + longWrapper.getValue());
    }

    @Test
    public void shouldCreateDeadLockSituation() throws InterruptedException {
        A a = new A();

        Runnable r1 = () -> a.a();
        Runnable r2 = () -> a.b();

        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();

        t1.join();
        t2.join();
    }

    public static void main(String[] args) {
        Runnable task = () -> {
            while(! Thread.currentThread().isInterrupted()) {
                System.out.print("Hello thread " );
            }};
        Thread thread = new Thread(task);
        thread.start();
        thread.interrupt();
        System.out.print("Running in thread " + Thread.currentThread().getName());
        //thread.start();


    }
}
