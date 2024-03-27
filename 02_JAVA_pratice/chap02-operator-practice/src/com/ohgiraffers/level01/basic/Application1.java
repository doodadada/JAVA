package com.ohgiraffers.level01.basic;

public class Application1 {
    /* Application01
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		System.out.println() 의 결과를 예측하고 이유를 설명하시오.
		*/
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        System.out.println(y >= 5 || x < 0 && x > 2); //결과 : true, (y >= 5)가 true이기 때문에 논리 or연산자 뒤의 구문은 실행하지 않아도 true이다.
        System.out.println(y += 10 - x++); //결과 : 13, y에 10을 더하고 x(==2)를 빼고 x에 1증감한 이후 y값을 출력하기 때문, 단 x는 1증감되어 있어 아래구문부터는 x의 값은 3이다.
        System.out.println(x+=2); //결과 : 5, 위 구문에서 x의 값이 1증감된 이후 2를 더한 값을 출력하므로 3+2의 결과값은 5이다.
        System.out.println( !('A' <= c && c <='Z') );//결과 : false, 먼저 괄호안의 식은 'A'가 c와 같아 true,c가 'Z'(==80)으로 같아 true,괄호안 &&연산을 하면 (true && true)로 true인데 괄호밖 !연산으로 인해 false로 된다.
        System.out.println('C'-c); //결과 : 2, 'C'의 문자코드는 67이므로 67-65의 값은 2이다.
        System.out.println('5'-'0'); //결과 : '5'의 문자코드는 53, '0'의 문자코드는 48(사실 문자코드를 모르더라도 5차이가 나므로 둘의 문자코드 차값이 5일 것을 예측할 수 있다.) 53-48의 차는 5이다.
        System.out.println(c+1); //결과 : 66, 변수 c의 할당된 값 'A'의 문자코드는 65, 65+1의 값은 66이다.
        System.out.println(++c); //결과 : B, 변수 c의 값을 1증가시키면 문자코드 값이 증가되어 66이되고 이는 'B'에 해당한다.
        System.out.println(c++); //결과 : B, 변수 c를 출력 시킨 후 1증가시키므로 출력시 값은 이전과 동일하다, 이후 c를 그대로 다시 출력한다면 1증가 되어 다른 값이 나올 것을 예측할 수 있다.
        System.out.println(c); //결과 : C, 위 구문에서 c를 1 증가시켰으므로 C가 출력된다.
    }
}
