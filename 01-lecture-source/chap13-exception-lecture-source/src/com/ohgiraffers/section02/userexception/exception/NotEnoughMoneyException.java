package com.ohgiraffers.section02.userexception.exception;

public class NotEnoughMoneyException extends Exception{

    /* 문자열은 부모 생성자쪽으로 전달하여 초기화 하는 생성자 */
    public NotEnoughMoneyException(String message) {
        /* 예외 인스턴스 생성 시점에서 부모 생성자*/
        super(message);
    }
}
