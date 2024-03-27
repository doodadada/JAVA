package com.ohgiraffers.teamStudy;

import java.util.Scanner;

public class Practice2 {
    /* 2. 키보드로 원의 반지름 값을 정수형으로 입력 받고 원의 둘레와 면적을 계산해서
    *  아래처럼 나오게 하시오.
    *
    *  원의 반지름 입력 : 5
    *  반지름이 5인 원의 둘레 : 31.400000000000002
    *  반지름이 5인 원의 면적
    *
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 반지름 입력 : ");
        int r = sc.nextInt();
        double pi = 3.14;
        double circleRound = 2*r*pi;
        double circleArea = r*r*pi;

        System.out.println("반지름이 5인 원의 둘레 : "+circleRound);
        System.out.println("반지름이 5인 원의 면적 : "+circleArea);
    }
}
