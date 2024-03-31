package com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args) {
        /* 수업목표. 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */

        /*
        *  매개변수(parameter)로 사용 가능한 자료형
        *  1. 기본자료형
        *  2. 기본자료형 배열
        *  3. 클래스자료형
        *  4. 클래스자료형 배열
        *  5. 가변인자
        * */

        /* 인스턴스 생성*/
        ParameterTest pt = new ParameterTest();

        /* 1. 기본 자료형을 매개변수로 전달받는 메소드 호출확인 */
        int num = 10;
        pt.testPrimaryType(num);

        /* 2. 기본 자료형 배열을 매개변수로 전달받는 메소드 호출확인 */
        int[] iarr = new int[]{1,2,3,4,5,};
        System.out.println("인자로 전달하는 값 : "+iarr);
        System.out.println("함수호출");
        pt.testPrimaryTypeArray(iarr);


        System.out.println();
        System.out.print("원본 배열의 값 : ");
        for (int n : iarr) {
            System.out.print(n + " ");
        }
        System.out.println();
        /* 3. 클래스 자료형 */
        Rectangle r1 = new Rectangle(12.5,22.5);
        System.out.println("인자로 전달하는 값 : "+r1);
        //r1.calArea();
        //r1.calRound();
        pt.testClassType(r1); //위 코드와 동일한 클래스 주소값이 같은것을 통해 얕은 복사가 되는것을 확인

        System.out.println("변경 후 사격형의 넓이와 둘레============");
        r1.calArea();
        r1.calRound();

        /* 4. 클래스 자료형은 뒤에서 다룬다.*/

        /* 5. 가변인자 */
        // pt.testVariableLengthArray(); //이 함수는 최소 한가지 string은 넣어줘야함 에러발생
        pt.testVariableLengthArray("홍길동"); //가변인자는 전달하지 않아도 됨
        pt.testVariableLengthArray("유관순","볼링"); //1개도 가능
        pt.testVariableLengthArray("이순신","축구","야구","농구","롤","독서","볼링"); //여러개도 가능
        pt.testVariableLengthArray("신사임당",new String[]{"테니스","서예"}); //배열도 가능
    }
}
