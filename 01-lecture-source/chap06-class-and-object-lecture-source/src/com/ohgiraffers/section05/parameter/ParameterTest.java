package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryType(int num) {
        System.out.println("매개변수로 전달 받은 값 = " + num);
    }

    public void testPrimaryTypeArray(int[] arr) {
        System.out.println("매개변수로 전달받은 값 = " + arr);
        System.out.print("배열의 값 출력 : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        arr[0] = 99;

        System.out.print("변경후 배열의 값 출력 : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public void testClassType(Rectangle rectangle){

        System.out.println("매개변수로 전달받은 값 : "+rectangle);

        rectangle.setHeight(100);
        rectangle.setWidth(100);

        System.out.println("==========변경후 사각형의 넓이와 둘레 ==========");
        rectangle.calArea();
        rectangle.calRound();
    }


    public void testVariableLengthArray(String name, String ...hobby){
        System.out.println("이름 : "+name);

        System.out.println("취미의 갯수 : "+hobby.length);
        System.out.print("취미 : ");
        for (String s : hobby){
            System.out.print(s+" ");
        }
        System.out.println();
    }


    //**가변배열은 모호성 때문에 컴파일 에러가 발생해서 오버로딩하지 않는 것이 좋다.
//    public void testVariableLengthArray(String ...hobby){
//        System.out.println("취미의 갯수 : "+hobby.length);
//        System.out.print("취미 : ");
//        for (String s : hobby){
//            System.out.print(s+" ");
//        }
//        System.out.println();
//    }



}
