package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application2 {

    public static void main(String[] args) {
        /* 수업목표. 임포트에 대해 이해할 수 있다.*/
        /*
        * 임포트란?
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야한다.
        * 하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
        * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import문이다.
        * import는 package 선언문과 class선언문 사이에 작성하며
        * 어떠한 패키지 내에 클래스를 사용할 것인지 선언하는 효과를 가진다.
        * */


        /* 1. non-static method의 경우*/
        Calculator cal = new Calculator(); //line 3에 보면 Calculator class를 import한 것을 알 수있다.
        System.out.println("두 수 중 더 작은 값은? "+cal.minNumberOf(50,60));

        /* 2. static method의 경우*/
        System.out.println("두 수 중 더 큰 값은? "+ maxNumberOf(50,60));

        /* 3. static method를 호출할 때 클래스 명을 생략하고 사용할 수 있다.*/
        int max2 = maxNumberOf(100, 200);
        System.out.println("두 수 중 더 큰 값은? "+ max2);

    }
}
