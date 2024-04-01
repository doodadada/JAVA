package com.ohgiraffers.section01.users;

public class MemberRepository {

    private final static Member[] member; //프로그램 start와 동시에 생성하나?
    private static int count; //초기값 0

    static {
        member = new Member[10];
    }

    public static boolean store(Member[] members) {
        for(int i = 0; i<members.length;i++){
            member[count++] = members[i];
        }


        return true;
    }

    public static Member[] findAllMembers() {
        return member;
    }
}
