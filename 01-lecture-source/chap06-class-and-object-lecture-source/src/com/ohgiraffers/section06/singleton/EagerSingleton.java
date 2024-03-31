package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    private static EagerSingleton eager = new EagerSingleton();

    private EagerSingleton(){} //*private를 사용해서 외부에서 인스턴스를 생성하는 것을 제한하는 기능

    public static EagerSingleton getInstance(){
        return eager;
    }

}
