package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args){
        /*  수업목표. 논리연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다.*/
        /*  논리 연산자의 우선수위와 활용
        *   논리 and 연산자와 논리 or 연산자의 우선순위
        *   && : 11순위
        *   || : 12순위
        *   논리 and 연산자 우선순위가 논리 or 연산자 우선순위보다 높다
        * */

        /*  1. 1부터 100 사이의 값인지 확인*/
        /*  1<= 변수 <=100 이렇게는 사용 못함 --> 1<=변수 && 변수 <= 100 */
        int num1 = 55;
        System.out.println(num1+"가 1부터 100 사이인지 확인 : "+ ( 1<= num1 && num1 <=100));

        int num2 =  166;
        System.out.println(num2+"가 1부터 100 사이인지 확인 : "+ ( 1<= num2 && num2 <=100));

        /*  2. 영어의 대문자인지 확인 */
        /*  영어 대문자냐?--> 'A'<=문자변수 && 문자변수 <='Z'*/
        char ch = 'G';
        System.out.println(ch+"가 영어 대문자인지 확인 : "+ ( 'A'<= ch && ch <='Z'));

        char ch1 = 'g';
        System.out.println(ch1+"가 영어 대문자인지 확인 : "+ ( 'A'<= ch1 && ch1 <='Z'));

        /*  3. 대소문자와 상관없이 영문자 y인지 확인 */
        /*  문자변수 == 'y' || 문자변수 == 'Y' */
        char ch2 = 'y';
        System.out.println(ch2+"가 영문자 y인지 확인 : "+ ('y'==ch2||ch2=='Y'));

        char ch3 = 'Y';
        System.out.println(ch3+"가 영문자 y인지 확인 : "+ ('y'==ch3||ch3=='Y'));

        /*  4. 영문자인지 확인 */
        /*  A : 65, Z : 90, a:97, z : 122 (중간의 91~96까지는 영문자가 아님)*/

        char ch5 = 'f';
        System.out.println(ch5+"가 영문자인지 확인 : " + (('A'<=ch5 && ch5 <='Z')||('a'<=ch5 && ch5<='z')));
        System.out.println(ch5+"가 영문자인지 확인 : " + ((65<=ch5 && ch5 <=90)||(97<=ch5 && ch5<=122)));



    }
}
