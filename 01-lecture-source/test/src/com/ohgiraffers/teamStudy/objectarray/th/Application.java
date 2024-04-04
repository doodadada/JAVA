package com.ohgiraffers.teamStudy.objectarray.th;

public class Application {

    public static void main(String[] args) {
        /*객체 배열을 이용하여 3개의 클래스의 메소드를 불러올 있다.
첫번째 클래스 = 학생/ 두번째 클래스 = 교수/ 세번째 클래스 = 대학교/ 메인

1. Student 클래스를 만들어 해당클래스 접근가능한 나이 이름과 getter를 가져와라
2. Professor 클래스를 만들어 해당클래스 접근가능한 나이 전공과 getter를 가져와라
3. University 클래스를 만들어 해당클래스 접근가능한 객체배열 선언 (학생 , 교수) 을 하라.
4. 생성자 호출후 showStudent 메소드를 만들어 향상된 for문을 이용하여 학생의 이름과 아이디를 만들어라.
5. 이하 showProfessors . 똑같이 만들어라.
6. 마지막으로 메인구문 으로 객체를 이용하여 3명의 학생과 교수를 선언과 초기화 해준후,
불러와야 . 할클래스 에서 모든 학생과 교수를 불러와 출력하라.*/
        Student[] stuArr = new Student[3];
        stuArr[0] = new Student(20,"가가가");
        stuArr[1] = new Student(21,"나나나");
        stuArr[2] = new Student(23,"다다다");

        Professor[] proArr = new Professor[3];
        proArr[0] = new Professor(51,"physics");
        proArr[1] = new Professor(50,"chemistry");
        proArr[2] = new Professor(64,"computerScience");

        University uni = new University();

        System.out.println("=====학생정보=====");
        uni.showStudent(stuArr);
        System.out.println("=====교수정보=====");
        uni.showProfessor(proArr);

    }
}
