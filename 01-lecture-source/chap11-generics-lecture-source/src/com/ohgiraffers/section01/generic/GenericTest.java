package com.ohgiraffers.section01.generic;

public class GenericTest<T> {

    private T value;

    public GenericTest() {
    }

    public GenericTest(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
