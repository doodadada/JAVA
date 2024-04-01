package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

    public Car() {
        System.out.println("Car 클래스 기본 생성자 호출됨..."); //부모클래스를 자식클래스가 끌어다 쓰는 것을 확인하기 위한 호출용 구문
    }

    public void run(){
        runningStatus =true;
        System.out.println("자동차가 달립니다~");
    }

    public void soundHorn(){

        if(isRunning()){
            System.out.println("빵!빵!");
        }else{
            System.out.println("주행 중이 아닌 상태에는 경적을 울릴 수 없습니다.");
        }

    }

//    private boolean isRunning(){ //private는 자식클래스에서 overriding할수없음 아래의
//        return runningStatus;
//    }

    protected boolean isRunning(){ //protected는 overriding 가능
        return runningStatus;
    }

    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
