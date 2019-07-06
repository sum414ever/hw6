package com.cursor;

import java.util.Comparator;

public class SortingNumbersComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer n1, Integer n2) {
        if (Math.abs(n1 % 2) == Math.abs(n2 % 2)) {
            return n1 - n2;
        } else if (n1 % 2 == 0) {
            return -1;
        } else return 1;
    }
}
