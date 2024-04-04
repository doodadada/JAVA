package com.ohgiraffers.teamStudy.objectarray.es.star;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("홀수 입력 : ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("홀수(양수)를 입력해주세요 ");
            } else {
                String star = "*";
                String space = " ";
                for (int i = 1; i <= num; i += 2) { //num개 별까지의 행 출력 for구문
                    for (int j = 0; j <= (num - i) / 2; j++) { //한 행에 대한 for구문3개(공백,별,공백)
                        if (j != 0) {
                            System.out.print(space);
                        }
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print(star);
                    }
                    System.out.println();
                }
                for (int i = num-2; i > 0; i -= 2) { //이후 다시 별이 1개 될 때까지 행 출력 for구문
                    for (int j = 0; j <= (num - i) / 2; j++) { //한 행에 대한 for구문3개(공백,별,공백)
                        if (j != 0) {
                            System.out.print(space);
                        }
                    }
                    for (int j = 1; j <= i; j++) { //별 출력
                        System.out.print(star);
                    }
                    System.out.println();
                }
                break;
            }
        }
    }
}
