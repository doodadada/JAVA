package com.ohgiraffers.section04.uses2;

public interface SaveProvider {

    /*  인터페이스 안에 작성한 메소드는 묵시적으로 public abstract의 의미를 가진다(다른 접근제한자 사용불가)*/
    boolean save(String data);


}
