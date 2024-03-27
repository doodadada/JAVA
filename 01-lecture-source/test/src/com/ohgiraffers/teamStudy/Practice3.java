package com.ohgiraffers.teamStudy;

import java.util.Scanner;

public class Practice3 {

    /* 3. 학생들의 신장 평균을 조사하려고 한다. 세 명의 학생의 키를 실수형으로 입력받아
    *  키의 평균을 정수형으로 출력하시오. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 학생의 키 입력 : ");
        double stud1 = sc.nextDouble();
        System.out.print("두 번째 학생의 키 입력 : ");
        double stud2 = sc.nextDouble();
        System.out.print("세 번째 학생의 키 입력 : ");
        double stud3 = sc.nextDouble();

        int average = (int)(stud1+stud2+stud3)/3;

        System.out.println("키의 평균 : "+average);
    }
}
