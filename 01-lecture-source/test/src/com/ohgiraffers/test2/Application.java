package com.ohgiraffers.test2;

import com.ohgiraffers.test1.TestMethod;

public class Application {
    public static void main(String[] args) {
        TestMethod test = new TestMethod();
        test.Calculator(2,5);
        double circleArea = test.CircleArea();
        System.out.println("원의 넓이는 : "+circleArea);
        System.out.println(test.TestRandom());


    }
}
