package com.ohgiraffers.section02.String;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표. String 클래스에 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다.*/
        /*
        *  charAt() : 해당 문자열의 인덱스에 해당하는 문자를 반환한다.
        *  인덱스는 0부터 시작하는 숫자체계를 의미하며
        *  인덱스를 벗어난 정수를 인자로 전달하는 경우 indexOutBoundException 발생
        *
        * */

        String str = "apple";
        for(int i=0;i<str.length();i++){
            System.out.println("charAt(" + i + ") : " +str.charAt(i));
        }

        /*
        *  compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
        *  두 문자열이 같으면 0을 반환, 인자로 전달한 문자열보다 작으면 음수를
        *  크면 양수를 반환한다.
        *  단, 이 메소드는 대소문자를 구분하여 비교한다.
        * */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";
        System.out.println("compareTo() : " + (str2.compareTo(str3))); //0

        System.out.println("compareTo() : " + (str4.compareTo(str2))); //-32
        System.out.println("compareTo() : " + (str2.compareTo(str4))); //32

        System.out.println("compareTo() : " + (str2.compareTo(str5))); // -5
        System.out.println("compareTo() : " + (str5.compareTo(str2))); // 5

        /* concat() : 문자열에 인자로 전달한 문자열을 합치기 해서 새로운 문자열을 반환한다.
        *  원본 문자열에는 영향을 주지 않는다.
        *  */

        System.out.println("concat() : " + (str2.concat(str5)));
        System.out.println("str2 = " + str2); // 덧셈 연산자로도 concat기능을 할 수 있다.

        /*
        *  indexOf() : 문자열에서 특정 문자를 탐색하여 '처음' 일치하는 인덱스 위치를 정수형으로 반환한다.
        *  단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * */

        String indexOf = "java oracle";

        System.out.println(indexOf.indexOf('a')); //1
        System.out.println(indexOf.indexOf('z')); //-1
        System.out.println("===== indexOf() =====");
        for(int i = 0; i<indexOf.length();i++){
            System.out.println(indexOf.indexOf(indexOf.charAt(i)));
        }


        /*
        *  lastIndexOf() : 문자열 탐색을 뒤에서 부터하고 처음 일치하는 위치의 인덱스를 반환한다.
        *  단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * */
        System.out.println(indexOf.lastIndexOf(' ')); //공백도 하나의 문자
        System.out.println("===== lastIndexOf() =====");
        for(int i = 0; i<indexOf.length();i++){
            System.out.println(indexOf.lastIndexOf(indexOf.charAt(i)));
        }

        /* trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */
        String trimStr = "   java   "; //앞 뒤 공백 3칸
        System.out.println("trimStr = #"+trimStr+"#");//#은 공백확인용 임의 문자
        System.out.println("trimStr = #"+trimStr.trim()+"#");//공백 제거

        /*
        *  toLowerCase() : 모든 문자를 소문자로 변환시킨다.
        *  toUpperCase() : 모든 문자를 대문자로 변환시킨다.
        * */

        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() = " + caseStr.toLowerCase()); //javaoracle
        System.out.println("toUpperCase() = " + caseStr.toUpperCase()); //JAVAORACLE

        /*
        *  substring() : 문자열 일부분을 잘라내어 새로운 문자열을 반환한다.
        * */
        String javaoracle = "javaoracle";
        System.out.println("substring(3)" + javaoracle.substring(3)); //aoracle
        System.out.println("substring(3, 6)" + javaoracle.substring(3,6)); //aor

        /* replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 변환한다.*/
        System.out.println("replace() : " + javaoracle.replace("java","phthon"));//pythonoracle
        System.out.println("");//javaoracle, 원본에 영향 없음

        /* length() : 문자열의 길이를 정수형으로 반환한다. */
        System.out.println("length() : " + javaoracle.length()); //10
        System.out.println("빈 문자열의 길이 "+("   ".length())); //공백 문자열도 가능

        /* isEmpty() : 문자열의 길이가 0이면 true를 아니면 false를 반환 */
        System.out.println("isEmpty() : " + "".isEmpty()); //true
        System.out.println("isEmpty() : " + "   ".isEmpty()); //false, 공백은 문자열 길이가 있음

        /* 길이가 0인 문자열은 null과는 다르다. */
        String str6 = null;
        String str7 ="";



    }
}
