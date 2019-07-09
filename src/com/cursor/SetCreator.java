package com.cursor;

import java.util.Set;
import java.util.TreeSet;

public class SetCreator {
    static Set<Integer> numbers = new TreeSet<>(new SortingNumbersComparator());

    static {
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(6);
    }
}
