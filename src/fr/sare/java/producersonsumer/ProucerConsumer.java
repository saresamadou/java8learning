package fr.sare.java.producersonsumer;

public class ProucerConsumer {
    private static Object lock = new Object();
    private static int[] buffer;
    private static int count;

    static class Producer {

        void produce() throws InterruptedException {
            synchronized (lock) {
                while (isFull(buffer)) {
                    lock.wait();
                }
                buffer[count++] = 1;
                lock.notifyAll();
            }
        }


    }

    static class Consumer {
        void consume() throws InterruptedException {
            synchronized (lock) {
                while (isEmpty(buffer)) {
                    lock.wait();
                }
                buffer[--count] = 0;
                lock.notifyAll();
            }
        }
    }

    static boolean isFull(int[] buffer) {
        return count == buffer.length;
    }

    static boolean isEmpty(int[] buffer) {
        return count == 0;
    }
}
