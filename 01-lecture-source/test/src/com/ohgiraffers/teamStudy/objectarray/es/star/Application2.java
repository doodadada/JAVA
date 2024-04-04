package com.ohgiraffers.teamStudy.objectarray.es.star;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String star = "*";
        String space = " ";
        String line = "";
        while (true) {
            System.out.print("홀수 입력 : ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("홀수(양수)를 입력해주세요 ");
            } else {
                for (int i = 0; i < num; i++) {
                    str += star;
                }
                for(int i = (num-2);i>0;i-=2){
                    line="";
                    for(int j = (num-i)/2; j>0;j--){
                        line+=space;
                    }
                    for(int j= 0;j<i; j++){
                        line+=star;
                    }
                    str = (line + "\n" + str + "\n" + line);
                }
                System.out.println(str);
                break;
            }
        }
    }
}
