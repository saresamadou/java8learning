package fr.sare.java.functionalinterface;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Util class for person class
 */
public class PersonUtils {

    private PersonUtils() {

    }

    public static long identifyPAdultPerson(Person... persons) {
        return Arrays.asList(persons).stream().filter(person -> person.getAge() > 18).count();
    }

    public static void printPerson(Person... persons) {
        Arrays.asList(persons).stream().forEach(System.out::print);
    }

    public static double countPerson(Person... persons) {
        return Arrays.asList(persons).stream().count();
    }
}
