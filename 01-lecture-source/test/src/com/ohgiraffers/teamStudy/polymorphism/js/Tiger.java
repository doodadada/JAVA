package com.ohgiraffers.teamStudy.polymorphism.js;

public class Tiger extends Animal {
    @Override
    public void run() {
        System.out.println("호랑이가 힘차게 달려갑니다");
    }

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 물어뜯습니다");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울음소리를 냅니다 어흥!");
    }
}
