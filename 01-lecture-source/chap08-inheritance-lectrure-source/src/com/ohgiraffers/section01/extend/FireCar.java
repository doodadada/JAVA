package com.ohgiraffers.section01.extend;

public class FireCar extends Car{
    public FireCar(){

        super(); //부모의 기본생성자를 호출하는 구문,자식클래스에는 명시적으로 이것을 작성해야하는 규칙이있다(없어도 작동은 되긴함)

        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
    }


    @Override
    public void soundHorn() {
        if(isRunning()){
            System.out.println("빠아아아아앙!빠ㅏ앙아아아아앙!");
        }else{
            System.out.println("소방차가 앞으로 갈 수 없습니다 비키세요!!!!!!");
        }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다===============");
    }

}
