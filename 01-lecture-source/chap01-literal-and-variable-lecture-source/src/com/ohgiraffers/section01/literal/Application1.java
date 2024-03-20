package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main (String[] args){

        /*  수업목표. 여러가지의 값의 형태를 출력할 수 있다.*/

        /*  1.  숫자 형태의 값   */
        /*  1-1. 정수 형태의 값   */
        System.out.println(123);//123 정수
        /*  1-2. 실수 형태의 값   */
        System.out.println(1.23);//1.23 실수
        /*  2.  문자 형태의 값 출력 */

        System.out.println('a'); // 문자 형태의 값은 홀따옴표(single-quotation)으로 감싸주어야 한다.
//        System.out.println('ab'); //too many charaters in character literal
//        System.out.println(''); //empty character literal
        System.out.println('1'); //숫자값이지만 홀따옴표로 감싸져 있는 경우 문자'1'로 판단한다.(정상출력됨)
        System.out.println('남');
        /*  3.  문자열 형태의 값 출력 */
        System.out.println("안녕하세요"); //문자열 : 문자 여러개가 나열된 형태를 말하며, 쌍따옴표(double-qoutation)으로 감싸주어야 한다.
        System.out.println("123"); //정수이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 판단한다.
        System.out.println(" "); //아무것도 없는 빈 쌍따옴표로 문자열로 취급한다.
        System.out.println("a"); //한개의 문자도 쌍따옴표로 감싸면 문자열이다. 위에 'a'와 다르다.

        /*  4.  논리 형태의 값 출력 */
//        참이냐 거짓이냐
        System.out.println(true); //뱀은 파충류인가요?
        System.out.println(false); //뱀은 식물인가요?


    }
}