package com.ohgiraffers.teamStudy;

public class Practice1 {
    /* 1. 정수, 실수, 문자, 문자열, 논리형 변수를 각각 선언하고,
    *  아래의 값으로 초기화한 후 그 값을 출력하고, 변수의 값을 변경하여
    *  변경한 값을 출력하는 코드를 작성하시오.
    *
    *  초기화 후 : 100, 234.567, A, Hello world, true
    *  값 변경 후 : 10000, 567.123456789, B Welcom to JAVA, false
    * */
    // 단, 적절한 자료형이 무엇일지 생각해보고, 알맞은 변수를 이용하여 출력하시오.
    public static void main(String[] args) {
        //주어진 변수들 선언 및 초기화
        int inum = 100;
        double dnum = 234.567;
        char ch = 'A';
        String str = "Hello world";
        boolean isTrue = true;

        //출력
        System.out.println("선언 및 초기화");
        System.out.println("inum = " + inum);
        System.out.println("dnum = " + dnum);
        System.out.println("ch = " + ch);
        System.out.println("str = " + str);
        System.out.println("isTrue = " + isTrue);

        System.out.println();
        //값 변경
        inum = 10000;
        dnum = 567.123456789;
        ch = 'B';
        str = "Welcom to JAVA";
        isTrue = false;

        //값 변경 후 출력
        System.out.println("값 변경 후");
        System.out.println("inum = " + inum);
        System.out.println("dnum = " + dnum);
        System.out.println("ch = " + ch);
        System.out.println("str = " + str);
        System.out.println("isTrue = " + isTrue);

    }
}
