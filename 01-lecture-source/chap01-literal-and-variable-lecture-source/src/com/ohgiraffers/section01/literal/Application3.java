package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[] args) {


        /*  수업목표 : 문자열 합치기 결과를 예측하고 사용할 수 있다. */
        /*  목차 1. 두 개의 문자열 합치기 */
        System.out.println("===========두 개의 문자열 합치기===========");
        System.out.println(9 + 9); //18
        System.out.println("9" + "9"); //99
        System.out.println("9" + 9); //99
        System.out.println(9 + "9"); //99


        /*  목차 2. 세 개의 문자열 합치기 */
        System.out.println("===========세 개의 문자열 합치기===========");
        System.out.println(9 + 9 + 9); //27
        System.out.println("9" + 9 + 9); //999
        System.out.println(9 + "9" + 9); //999
        System.out.println(9 + 9 + "9"); //189 //왼쪽 연산부터 수행하고 수행결과를 오른쪽과 연산함
        System.out.println("9" + (9 + 9)); //918 //괄호 안의 연산부터 먼저 계산한다.

        /*  목차 3. 문자열 합치기 응용 */
        /*  10과 20의 사칙연산 결과를 출력하세요 */
        System.out.println("===========10과 20의 사칙연산 결과===========");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);
        //위 연산들의 값은 콘솔만 보면 어떤 연산의 결과값인지 알 수 없다.

        System.out.println("===========10과 20의 사칙연산 결과를 보기 좋게 출력===========");
        System.out.println("10" +"+" + "20" + "==" + (10 + 20)); //괄호를 묶지 않으면 문자열 합치기가 되어서 결과가 1020이 된다.
        System.out.println("10" +"-" + "20" + "==" + (10 - 20)); //덧셈을 제외한 나머지 연산들은 문자열에서 불가능하기 때문에 괄호를 반드시 사용해야 한다.
        System.out.println("10" +"*" + "20" + "==" + (10 * 20));
        System.out.println("10" +"/" + "20" + "==" + (10 / 20));
        System.out.println("10" +"%" + "20" + "==" + (10 % 20));

        System.out.println("===========연습 문제===========");
        System.out.println("기차"); //기차
        System.out.println("기차" + "칙칙폭폭"); //기차칙칙폭폭
        System.out.println("기차" + 123 + 45 + "칙칙폭폭"); //기차12345칙칙폭폭
        System.out.println(123 + 45 + "기차" + "출발"); //168기차출발
//ㅇㄹㅇㄹ

    }

}
