package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] agrs){

        /* 수업목표. 메소드 리턴값을 이해하고 활용할 수 있다.*/
        /*
        *  메소드 리턴값 테스트
        *  메소드는 항상 마지막에 return 명령어가 존재한다
        *  return은 자신을 호출한 구문으로 복귀하는 것을 의미한다.
        *  복귀를 할 때 그냥 복귀할 수도 있찌만 값을 가지고 복귀할 수도 있다.
        *  이때 가지고 가는 값을 리턴값이라고 한다.
        * */

        /*
        *  return값을 반환받기 위해서는 메소드 선언부에 리턴타입을 명시해 주어야한다.
        *  void는 아무 반환값도 가지지 않겠다는 리턴타입에 사용할 수 있는 키워드이다.
        *  반환값이 없는 경우 return 구문은 생략해도 컴파일러가 자동으로 추가해주지만,
        *  반환값이 있는 경우는 return구문을 반드시 명시적으로 작성해야한다.
        *  또한 메소드 선언부에 선언한 리턴타입 반환값의 자료형은 반드시 일치해야한다.
        * */
        System.out.println("main() 메소드 시작함");
        Application6 app6 = new Application6();
        app6.testMethod(); //return값을 받아줄 구문이 없어서 아무 일도 안 일어남

        String returnText = app6.testMethod();
        System.out.println(returnText);
        System.out.println(app6.testMethod());
        System.out.println("main() 메소드 종료함");

//        int[] beforeSort = {6,3,13,2,45,7};
//        int[] afterSort = app6.sortPractice(beforeSort);
//        for(int i : beforeSort){
//            System.out.print(i+"");
//        }
//        System.out.println("");
//        for(int i:afterSort){
//            System.out.print(i+",");
//        }
    }

    public String testMethod(){

        return "helloWorld";
    }

//    public int[] sortPractice(int[] beforeSort){
//        int minIndex = 0;
//        for(int i = 0; i<beforeSort.length;i++){
//            for(int j = i+1; j<beforeSort.length;j++){ //j
//                if(beforeSort[minIndex]>beforeSort[j]){
//                    minIndex=j;
//                }
//            }
//            //스와프
//            int tmp = beforeSort[i];
//            beforeSort[i]=beforeSort[minIndex];
//            beforeSort[minIndex]=beforeSort[tmp];
//
//
//        }
//
//        int[] result = beforeSort;
//      return afterSort;
//    }



}
