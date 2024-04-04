package com.ohgiraffers.teamStudy.polymorphism.js;

public class Dog extends Animal {
    @Override
    public void run() {
        System.out.println("개가 달려갑니다 다다다다다");
    }

    @Override
    public void eat() {
        System.out.println("개가 사료를 먹습니다 가가");
    }

    @Override
    public void cry() {
        System.out.println("개가 짖습니다 멍멍!");
    }
}
