package com.ohgiraffers.section03.abstraction;

public class Car { //커뮤니케이션 다이어그램 가장 우측 객체 부터만들기

    private boolean isOn; //boolean의 초기값은 false == 시동이 꺼진게 default

    private int speed;

    /* 시동이 걸려있는 경우 할일이 없고 시동이 걸려있지 않은 경우 시동을 건다. */
    public void startUp() {
        if (isOn) {
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 이제 출발할 준비가 완료되었습니다.");
        }
    }

    public void go(){
        if(isOn){
            this.speed +=10;
            System.out.println("차가 앞으로 움직입니다.");
            System.out.println("현재 차의 시속은 "+this.speed+"km/h 입니다.");
        }else{
            System.out.println("차에 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요. ");
        }
    }

    public void stop(){
        if(isOn){
            if(this.speed>0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            }else{
                System.out.println("차는 이미 멈춰있는 상태입니다. ");
            }
        }else{
            System.out.println("차의 시동이 걸려있지 않았습니다. 시동 먼저 걸어주세요.");
        }
    }

    public void turnOff(){
        if(isOn){
            if(this.speed>0){
                System.out.println("달리는 중에는 시동을 끌 수 없습니다. 차를 우선 멈춰주세요");
            }else{
                this.isOn=false;
                System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 켜주세요.");
            }
        }else{
            System.out.println("이미 시동이 꺼져있습니다.");
        }

    }

}
