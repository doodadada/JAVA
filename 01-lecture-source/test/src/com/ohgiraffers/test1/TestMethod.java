package com.ohgiraffers.test1;

import java.util.Scanner;

public class TestMethod {
    public void Calculator(int num1, int num2){
        int plus = num1+num2;
        int minus = num1-num2;
        int multiple = num1*num2;
        int divide = num1/num2;
        int remain = num1%num2;

        System.out.println(num1+"+"+num2+"="+plus);
        System.out.println(num1+"-"+num2+"="+minus);
        System.out.println(num1+"*"+num2+"="+multiple);
        System.out.println(num1+"/"+num2+"="+divide);
        System.out.println(num1+"&"+num2+"="+remain);
    }
    public double CircleArea(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 반지름을 입력하세요 : ");
        int r = sc.nextInt();
        final double pi = 3.14;
        double circleArea = r*r*pi;
        return circleArea;
    }

    public String TestRandom(){
        int randomNumber = (int)(Math.random()*10)+1; //강제 형변환으로 소수점 절삭
        String result= "생성된 난수는 "+randomNumber+"입니다.";
        return result;
    }
}
