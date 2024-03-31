package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod(){

        this.count++;
        System.out.println("nonStaticMethod 호출함");
    }

    public static void staticMethod(){

        // this.count++;
        // 에러발생 위에 count 변수가 static변수가 아니기 때문에 프로그램 동작시 함수는 먼저 정의되는데 안에 있는 변수가 없어서 에러?
        System.out.println("Static 메소드 호출함");
    }
}
