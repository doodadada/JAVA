package com.ohgiraffers.section03.dto;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 데이터를 추상화하는 기법을 이해하고 이를 사용하여 프로그래밍 할 수 있다.*/

        /*
         *  캡슐화의 원칙에는 일부 어긋나긴 하지만 다른 목적을 가진 클래스와 객체를 추상화 하는 기법이 있다.
         *  행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체(Data Transfer Object)의 경우이다.
         *  이러한 객체를 설계할 때는 행위가 아닌 데이터가 위주이며, 캡슐화의 원칙을 준수하여
         *  모든 필드를 private로 직접 접근을 막고, 각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성해둔다.
         *  어떤것을 쓸 줄 모르니 미리 다 준비해두는 종합선물세트 같은 개념이다.
         *  private 필드와 필드값을 수정하는 설정자(setter), 필드에 접근하는 접근자(getter)들로 구성된다.
         *  주로 계층간 데이터를 주고 받을 목적으로 사용한다.
         * */

        MemberDTO member = new MemberDTO(){};
        member.setNumber(1);
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('남');
        member.setHeight(170);
        member.setActivated(true);


        System.out.println("회원번호 :  " + member.getNumber());
        System.out.println("회원이름 :  " + member.getName());
        System.out.println("나이 :  " + member.getAge());
        System.out.println("성별 : " + member.getGender());
        System.out.println("키 : " + member.getHeight());
        System.out.println("활성화 상태 : " + member.isActivated());
        
        System.out.println(member.toString());

    }
}
