package com.ohgiraffers.test;

import java.util.Comparator;

public class AscAuthor implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
