package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    private Car car = new Car();

    public void startUp() {
        car.startUp();
    }

    public void go(){
        car.go();
    }

    public void stop(){
        car.stop();
    }

    public void turnOff(){
        car.turnOff();
    }


}
