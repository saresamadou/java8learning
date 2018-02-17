package fr.sare.java.generics;

import java.util.ArrayList;
import java.util.List;

public class NonReifiableExamples {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<? extends Number> numbers = new ArrayList<>();

        System.out.println(strings.getClass());
        System.out.println(integers.getClass());
        System.out.println(numbers.getClass());
    }

}
