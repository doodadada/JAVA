package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a = new A_if();
        /* 단독 if문 흐름 확인 용 메소드 출력*/
        // a.testSimpleIfStatement();
        // a.testNestedIfStatement();
        B_ifElse b = new B_ifElse();
        //b.simpleIfElseStatement();
        //b.testNestedIfElseStatement();
        C_ifElseIf c = new C_ifElseIf();
        //   c.simepleIfElseIfstatement();
        D_switch d = new D_switch();
        //d.simpleSwitchStatement();
        d.testSwitchVendingMachine();
    }
}
