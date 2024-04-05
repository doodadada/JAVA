package com.ohgiraffers.interfaceTest;

public class Application {
    public static void main(String[] args) {
        interTest<String> test = new interTest() {
            @Override
            public void test() {
                System.out.println("확장");
            }
        };
        test.test();

    }
}
