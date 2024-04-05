package com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{
    /*@Override
    public void method() throws IOException { //예외없이 오버라이딩 가능
        super.method();
    }*/
        /* 같은 예외를 던져주는 구문으로 오버라이딩 해야한다.*/
//    @Override
//    public void method() throws IOException {
//
//    }
        /* 부모의 예외처리 클래스보다 상위 예외로는 후손 클래스에서 오버라이딩 할 수 없다.*/
//    @Override
//    public void method() throws Exception { //에러발생, Exception>IOException, 부모보다 더 상위의 예외처리를 하려해서 발생
//
//    }

        /* 부모의 예외처리보다 하위예외인 경우 오ㅓ라이딩 할 수 있다. */
    @Override
    public void method() throws FileNotFoundException {
    }
}
