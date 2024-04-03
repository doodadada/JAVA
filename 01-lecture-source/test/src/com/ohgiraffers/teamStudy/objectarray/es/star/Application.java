package com.ohgiraffers.teamStudy.objectarray.es.star;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("홀수 입력 : ");
            int num = sc.nextInt();
            if(num%2==0){
                System.out.println("홀수(양수)를 입력해주세요 ");
            }
        }
    }
}
