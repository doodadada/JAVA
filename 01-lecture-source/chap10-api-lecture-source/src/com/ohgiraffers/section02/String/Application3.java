package com.ohgiraffers.section02.String;

import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) {
        /* 수업목표. 문자열 분리에 대해 이해하고 적용할 수 있다. */
        /*
        *  문자열을 구분자로 하여 분리한 문자열을 반환하는 기능을 한다.
        *  split() : 정규표현식을 이용하여 문자열을 분리한다.
        *            비정형화된 문자열을 분리할 때 좋지만(공백문자열 포함)
        *            정규표현식을 이용하기 때무넹 속도가 느리다는 단점을 가진다
        *            정규표현식은 자바스크립트에서 다룰 예정
        *  StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
        *                    정형화된 문자열 패턴을 분리할 때 사용하기 좋다(공백 문자열 무시)
        *                    split()보다 속도면에서 더 빠르다
        *                    구분자를 생략하는 경우 공백이 구분자이다.
        * */

        String emp1 = "100/홍길동/서울/영업부"; //모든 값이 존재함
        String emp2 = "200/유관순//영업부"; //주소 없음
        String emp3 = "300/이순신/경기도/"; //부서 없음

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");


        for(int i = 0; i<empArr1.length;i++){
            System.out.println("empArry1["+i+"] : "+empArr1[i]);
        }

        for(int i = 0; i<empArr2.length;i++){
            System.out.println("empArry2["+i+"] : "+empArr2[i]);
        }

        for(int i = 0; i<empArr3.length;i++){
            System.out.println("empArry3["+i+"] : "+empArr3[i]);
        }

        String[] empArry4 = emp3.split("/",-1); //마지막 문자열에 값이 없으면 -1 입력
        for(int i = 0; i<empArry4.length;i++){
            System.out.println("empArry4["+i+"] : "+empArry4[i]);
        }

        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        while(st1.hasMoreElements()){
            System.out.println("st1 : " + st1.nextToken());
        }

        while(st2.hasMoreElements()){
            System.out.println("st2 : " + st2.nextToken());
        }

        while(st3.hasMoreElements()){
            System.out.println("st3 : " + st3.nextToken());
        }

        String colorStr ="red*orange#blue/yellow green";

        // String[] color = colorStr.split("*#/ "); //에러발생, "*#/ "이란 표현식은 없음
        String[] color = colorStr.split("[*#/ ]"); //[]로 묶으면 가능

        for(int i = 0; i<color.length;i++){
            System.out.println("color["+i+"] : "+color[i]);
        }
        StringTokenizer colorTokenizer = new StringTokenizer(colorStr,"*#/ "); //tokenizer에 사용하는 인자는 정규표현식이 아니라서 저렇게 사용해도 가능

        while(colorTokenizer.hasMoreTokens()){
            System.out.println("colorStr : " + colorTokenizer.nextToken());
        }
    }
}
