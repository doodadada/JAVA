package com.ohgiraffers.teamStudy.objectarray.jb.ex1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("=====회원정보 객체예제 프로그램=====");
        Member[] members = new Member[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<members.length;i++){
            System.out.print("아이디를 입력하세요 : ");
            String id = sc.next();
            System.out.print("패스워드를 입력하세요 : ");
            String pwd = sc.next();
            System.out.print("이름을 입력하세요 : ");
            String name = sc.next();
            System.out.print("나이를 입력하세요 : ");
            int age = sc.nextInt();
            System.out.print("성별을 입력하세요 : ");
            char gender = sc.next().charAt(0);
            members[i] = new Member(id,pwd,name,age,gender);

        }
        for(Member i : members){
            System.out.println(i.toString());
        }
    }
}
