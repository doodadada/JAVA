package com.ohgiraffers.test;

import java.util.Comparator;

public class AscTitle implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
