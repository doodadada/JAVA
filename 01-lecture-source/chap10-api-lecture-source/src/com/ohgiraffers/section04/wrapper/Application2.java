package com.ohgiraffers.section04.wrapper;

public class Application2 {
    public static void main(String[] args) {
        /* 문자열 파싱(parsing)에 대해 이해할 수 있다.*/
        /*
        *  parsing : 문자열(String)값을 기본 자료형 값으로 변경하는 것을 parsing이라고 한다.
        * */

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("10");
        int i = Integer.parseInt("132123");
        long l = Long.parseLong("12312312312312321123");
        //long l = Long.parseLong("8L"); //에러발생, L 빼고 취해야함
        float f = Float.parseFloat("4.0f"); //f는 됨
        double d = Double.parseDouble("3.1415927");
        boolean bl = Boolean.parseBoolean("true");
        char c = "abc".charAt(0); //char는 parsing말고 charAt()함수를 쓰면 됨


    }
}
