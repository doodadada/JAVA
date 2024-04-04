package com.ohgiraffers.teamStudy.objectarray.es.stop;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while(true) {
            System.out.print("문자열 입력 : ");
            String inputStr = sc.next();
            if(!inputStr.equals("stop")){
                str+=(" "+inputStr);
                System.out.println("결과 : "+str);
            }else{
                System.out.println("결과 : "+str);
                break;
            }
        }

    }
}
