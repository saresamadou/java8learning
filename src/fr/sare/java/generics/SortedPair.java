package fr.sare.java.generics;

public class SortedPair<T extends Comparable<T>> {
    private final T first;
    private final T second;

    public SortedPair(T first, T second) {
        if(first.compareTo(second) < 0) {
            this.first = first;
            this.second = second;
        } else {
            this.second = first;
            this.first = second;
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    private T foo(T t) {
        int result = t.compareTo(first);

        return first;
    }
}
