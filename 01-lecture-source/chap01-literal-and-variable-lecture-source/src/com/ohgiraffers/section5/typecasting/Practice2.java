package com.ohgiraffers.section5.typecasting;

public class Practice2 {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 3.5;

        // 자동 형변환과 강제 형변환을 동시에 사용하는 예제
        double result = intValue + intValue / doubleValue; // intValue가 double로 자동 형변환됨
        int roundedResult = (int) result; // 결과를 정수형으로 강제 형변환

        System.out.println("연산 결과: " + result);
        System.out.println("결과를 정수로 형변환한 값(소숫점 절삭으로 활용) : " + roundedResult);
    }
}
