package com.ohgiraffers.teamStudy.objectarray.es.example2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("문자열 입력 : ");
            String inputText = sc.next();
            if (inputText.length() != 5) {
                System.out.println("길이가 5인 문자열을 입력하세요");
            }else{
                for(int i = 0; i<inputText.length();i++){
                    System.out.println(inputText.charAt(i)+" : "+(inputText.charAt(i)+0));
                }
                break;
            }
        }
    }
}
