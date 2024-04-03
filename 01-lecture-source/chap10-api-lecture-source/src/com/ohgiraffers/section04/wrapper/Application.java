package com.ohgiraffers.section04.wrapper;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. Wrapper클래스에 대해 이해할 수 있다. */
        /*
        *  상황에 따라 기본타입 데이터를 인스턴스화 해야하는 경우가 발생한다.
        *  이때 기본타입의 데이터를 먼저 인스턴스로 변환 후 사용해야 하는데
        *  8가지의 해당하는 기본타입의 데이터를 인스턴스화 할 수 있도록 하는 클래스를
        *  Wrapper 클래스라고 한다.
        *  (주변에서 사용하는 랩(Wrap)과 같은 형태로 감싼다는 뜻이다)
        * */

        /*
        *  기본타입     래퍼클래스
        *   byte        Byte
        *   short       Short
        *   int         Integer
        *   long        Long
        *   float       Float
        *   double      Double
        *   char        Character
        *   boolean     Boolean
        * */

        /* 박싱(Boxing)과 언박싱(Unboxing)
        *  기본 타입을 레퍼런스의 인스턴스로 인스턴스화 하는 것을 박싱이라고 하며
        *  래퍼클래스 타입의 인스턴스를 기본타입으로 하는 변경하는 것을 언박싱이라고 한다.
        * */

        int intValue = 20;
        Integer boxingNum1 = new Integer(intValue); //인스턴스화 - 박싱 //생성자 이용 //자바 9이후부터는 제거된 사용표현
        Integer boxingNum2 = Integer.valueOf(intValue); //static 메소드 이용

        int unBoxingNum1 = boxingNum1.intValue(); //기본타입화 - 언박싱 //메소드 이용

        /*
        *  오토박싱(autoBoxing)과 오토 언박싱(autoUnbBoxing)
        *  JDK 1.5 부터는 박싱과 언박싱이 필요한 상황에서 자바 컴파일러가 이를 자동으로 처리해준다.
        *  이런 자동화된 박싱과 언박싱을 각각 오토박싱, 오토언박싱 이라고 한다.
        * */

        Integer boxingNum3 = intValue; //오토박싱
        int unBoxingNum3 = boxingNum3; //오토언박싱

        int inum = 20;
        Integer integerNum1 = new Integer(20);
        Integer integerNum2 = new Integer(20);
        Integer integerNum3 = 20;
        Integer integerNum4 = 20;

        System.out.println("int와 Integer 비교 : " + (inum ==integerNum3)); //true
        System.out.println("int와 Integer 비교 : " + (inum ==integerNum4)); //true

        System.out.println("Integer와 Integer 비교 : "+ (integerNum1==integerNum2)); //false
        System.out.println("Integer와 Integer 비교 : "+ (integerNum1==integerNum3)); //false
        System.out.println("Integer와 Integer 비교 : "+ (integerNum3==integerNum4)); //true //오토박싱을 통한 인스턴스간의 비교값은 true

        System.out.println("equals() : "+(integerNum1.equals(integerNum2))); //위 에선 false였던 비교값이 여기선 true
        System.out.println("equals() : "+(integerNum1.equals(integerNum3)));
        System.out.println("equals() : "+(integerNum3.equals(integerNum4)));

        System.out.println("valueOf() : "+(Integer.valueOf(123)==Integer.valueOf(123))); //박싱의 가장 좋은 방법(권장) static 메소드 이용




    }
}
