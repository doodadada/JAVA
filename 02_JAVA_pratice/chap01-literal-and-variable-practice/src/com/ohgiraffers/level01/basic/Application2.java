package com.ohgiraffers.level01.basic;

public class Application2 {
    /* Application02
     * 사각형의 넓이와 둘레를 구하는 문제이다.
     * 너비 12.5 높이 36.4를 변수에 저장하고
     * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
     *
     * -- 출력 예시 --
     * 면적 : 455.0
     * 둘레 : 97.8
     *  */
    public static void main(String[] args) {
        double width =12.5;
        double height = 36.4;
        //변수에 담고랬는데 안담아서 감점임 아래 코드를 추가함.
        double area = (width*height);
        double round = (width*2+height*2);

        System.out.println("면적 : "+area);
        System.out.println("둘레 : "+round);


    }

}
