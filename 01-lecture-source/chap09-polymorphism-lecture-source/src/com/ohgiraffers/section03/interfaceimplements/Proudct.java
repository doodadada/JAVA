package com.ohgiraffers.section03.interfaceimplements;

public class Proudct extends Object implements InterProduct, java.io.Serializable{

    /*
    *  클래스에서 인터페이스를 상속 받을 때에는 implements 키워드를 사용한다
    *  또한 인터페이스는 여러개를 상속 받을 수 있으며,
    *  extends로 다른 클래스를 상속 받는 경우에도 그것과 별개로 인터페이스 추가 상속이 가능해진다
    *  단, extends 키워드를 앞에 작성하고 implements를 뒤에 작성한다(순서 바뀌면 에러 발생)
    * */

    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod overridng한 메소드 호출함...");
    }

    @Override
    public void absMethod() {
        System.out.println("InterProduct의 absMethod overridng한 메소드 호출함...");
    }
    /* static 메소드는 overriding이 불가능하다*/
    /*@Override
        public static void staticMethod(){
    }*/

    /* default 키워드가 들어간 메소드는 인터페이스에서만 작성 가능하다*/
    /*@Override
    public default void defaultMethod() {
        InterProduct.super.defaultMethod();
    }*/

    @Override
    public void defaultMethod() {
        System.out.println("Product 클래스의 defaultMethod 메소드 호출함...");
    }
}
