package com.cursor;

import java.util.Comparator;

public class SortingNumbersComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer n1, Integer n2) {
        if (n1 % 2 == 0) {
            if (n2 % 2 == 0) {
                return 1;
            }
            return -1;
        } else if (n2 % 2 == 0) {
            return 1;
        }
        return 1;
    }
}
