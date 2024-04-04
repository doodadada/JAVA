package com.ohgiraffers.initblock.example;

public class Restaurant {
    static String dish = initializeStaticVariable(); //명시적 값 초기화(접시)

    // 인스턴스 변수(instance variable)
    String order = initializeInstanceVariable();

    // 인스턴스 초기화 블록(instance initialization block)
    {
        System.out.println("1) 인스턴스 초기화 블록 실행 : 주문 확인하겠습니다~");
    }

    // 정적 블록(static block)
    static {
        System.out.println("2) 정적 블록 실행 : 접시 및 상차림을 내놓습니다");
    }
    // 생성자(Constructor)
    public Restaurant() {
        System.out.println("3) 생성자 실행 : 주문 받았습니다~");
    }

    // 정적 변수 초기화 메서드
    static String initializeStaticVariable() {
        System.out.println("4) 정적 변수 초기화 : 접시깨끗하게 합니다.");
        return "다 닦았습니다~";
    }

    // 인스턴스 변수 초기화 메서드
    String initializeInstanceVariable() {
        System.out.println("5) 인스턴스 변수 초기화 : 주문받습니다.");
        return "주문 받았습니다~";
    }
}
