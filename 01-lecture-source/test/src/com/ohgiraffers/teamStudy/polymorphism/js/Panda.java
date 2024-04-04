package com.ohgiraffers.teamStudy.polymorphism.js;

public class Panda extends Animal{
    @Override
    public void run() {
        System.out.println("판다는 뛰지 않습니다. 느릿느릿");    }

    @Override
    public void eat() {
        System.out.println("판다가 대나무잎을 뜯어먹습니다");
    }

    @Override
    public void cry() {
        System.out.println("판다가 울음소리를 냅니다 꾸어엉");
    }
}
