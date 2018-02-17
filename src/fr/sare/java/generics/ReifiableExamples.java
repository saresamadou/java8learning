package fr.sare.java.generics;

import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReifiableExamples {
    public static void main(String[] args) {
        System.out.println(int.class);
        System.out.println(String.class);

        List<?> wilcards = new ArrayList<>();
        System.out.println(wilcards.getClass());

        List rawType = new ArrayList();
        System.out.println(rawType.getClass());
        System.out.println(rawType.getClass() == wilcards.getClass());

        System.out.println(int[].class);

        List<String> strings = new ArrayList<>();
        Class<?> arrayList = strings.getClass();
        final TypeVariable<? extends Class<?>> [] typeVariables = arrayList.getTypeParameters();
        System.out.println(Arrays.toString(typeVariables));
    }
}
