package com.ohgiraffers.section5.typecasting;

public class Practice1 {
    public static void main(String[] args) {

        int num = 626331;
        solution(num);
        // int형 범위 : -2147483648 ~ 2147483647
        // 104번째 과정에서 오버플로우 발생
        System.out.println("=============");
        newsolution(num);
    }
    public static int solution(int num) {
        int answer = 0;
        int count = 0;
        while(num!=1){
            num = ((num%2)!=0) ? (num*3)+1 : num/2;
            count++;
            printcount(num,count);
        }
        answer = (count<=500) ? count : -1;
        print(num,answer);
        return answer;
    }
    public static void print(int num,int answer){
        System.out.println("결과값 : "+answer);
    }

    public static void printcount(long num,int count){ //int num이 들어와도 자동형변환에 의해 long으로 변환된다.
        System.out.println(count +"번째 num값 : "+num);
    }

    public static int newsolution(int num) {
        long lnum = num;
        int answer = 0;
        int count = 0;
        while(lnum!=1){
            lnum = ((lnum%2)!=0) ? (lnum*3)+1 : lnum/2;
            count++;
            printcount(lnum,count);
        }
        answer = (count<=500) ? count : -1;
        print(num,answer);
        return answer;
    }
}
