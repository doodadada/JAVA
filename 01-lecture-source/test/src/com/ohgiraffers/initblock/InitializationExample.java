package com.ohgiraffers.initblock;

public class InitializationExample {


    public static void main(String[] args) {
        System.out.println("6) 메인 메서드 시작");
        InitializationExample example1 = new InitializationExample();
        InitializationExample example2 = new InitializationExample();
    }
    // 정적 변수(static variable)
    static String staticVariable = initializeStaticVariable();

    // 인스턴스 변수(instance variable)
    String instanceVariable = initializeInstanceVariable();

    // 인스턴스 초기화 블록(instance initialization block)
    {
        System.out.println("1) 인스턴스 초기화 블록 실행");
    }

    // 정적 블록(static block)
    static {
        System.out.println("2) 정적 블록 실행");
    }
    // 생성자(Constructor)
    public InitializationExample() {
        System.out.println("3) 생성자 실행");
    }

    // 정적 변수 초기화 메서드
    static String initializeStaticVariable() {
        System.out.println("4) 정적 변수 초기화");
        return "Static";
    }

    // 인스턴스 변수 초기화 메서드
    String initializeInstanceVariable() {
        System.out.println("5) 인스턴스 변수 초기화");
        return "Instance";
    }
}
