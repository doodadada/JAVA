package com.ohgiraffers.section5.typecasting;

public class Application2 {
    public static void main(String[] args){
        /*  수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */


        /*  강제형변환
        *   바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        *   예)(바꿀 자료형) 값;
        * */


        /*
        *   자동형변환 규칙의 반대 상황에서 강제형변환이 필요하다.
        *   1. 강제형변환 규칙
        *    1-1. 큰 자료형에서 작은 자료형으로 변경시 강제 형변환이 필요하다.
        *    1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
        *    1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제형변환이 필요하다.
        *    1-4. 논리형은 강제 형변환 규칙에서도 제외된다.   */

        /*  1-1. 큰 자료형에서 작은 자료형으로 변경시 강제 형변환이 필요하다.*/
        /*   1-1-1. 정수 끼리의 강제 형변환 */
        long lnum=0;
        //int inum = lnum; //데이터 손실 가능성을 컴파일러가 알려준다. 에러발생
        int inum = (int)lnum; //변경하려는 자료형을 명시해서 강제 형변환을 해야한다.

        short snum = (short)inum;

        /*   1-1-2. 실수 끼리의 강제 형변환 */
        double dnum = 8.0;
        // float fnum = dnum; //데이터 손실 가능성을 컴파일러가 알려준다. 에러발생
        float fnum = (float) dnum;

        /*  1-2. 실수를 정수로 형 변환시 강체 형변환이 필요하다. */
        float fnum2 = 4.0f;
        // long lnum2 = fnum2; 소수점 이하 값 손실 가능성을 컴파일러가 알려준다. 에러발생
        long lnum2 = (long)fnum2; //강제형변환의 의미는 '내가 데이터 손실을 감안할테니 형변환 해줘'라는 의미이다.

        /*  1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다. */

        int num1 = 97;
        int num2 = -97;

        char ch1 = (char)num1;
        char ch2 = (char)num2;
        System.out.println(ch1+"&"+ch2);

        /*  1-4. 논리형은 강제형변환 규칙에서도 제외된다. */
        /*  강제형변환해도 전부 에러난다.*/
        boolean isTrue = true;
        // byte b = (byte) isTrue;


    }
}
