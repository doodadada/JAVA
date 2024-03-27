package com.ohgiraffers.test1;

public class Application {
    public static void main(String[] args) {
        // 1. 기본 자료형 8가지를 선언 및 초기화(0 제외 아무값)
        //정수형 4가지
        byte bnum = 3; //1byte
        short snum = 12; //2byte
        int inum = 21111111; //4byte
        long lnum = 222222222222222L; //8byte

        //실수형 2가지
        float fnum = 3.14f; //4byte
        double dnum = 2.718; //8byte

        //문자형 1가지
        char ch = 'a'; //2byte

        //논리형 1가지
        boolean isTrue = true; //1byte

        // 2. 정수 int의 값을 long 타입과 합하여 주세요.
        int inum1 = 13;
        long lnum1 = 300000000; //끝에 L생략 가능
        long result1 = inum1+lnum; // 자동형변환 규칙에 의해 inum1이 long타입으로 자동형변환됨
        System.out.println(inum1+"+"+lnum1+"="+result1);

        /* 3. 삼항연산자를 이용하여 2.의 합계를 0보다 클 때 양수입니다 0보다 작을 때
        * 음수입니다 표기해주세요
        * */

        System.out.println(result1>0?"양수입니다":"음수입니다.");





    }



}
