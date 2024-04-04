package com.ohgiraffers.section02.extend;

//public class RabbitFarm<T implements Animal> {} //에러발생
//public class RabbitFarm<T extends Animal> {} //정상
// public class RabbitFarm<T extends Animal & Rabbit> {} //에러 발생, 클래스 & 인터페이스 순서를 지켜야함
//public class RabbitFarm<T extends Rabbit & Animal> {}
//public class RabbitFarm<T extends Rabbit , Snake> {} //에러는 안나지만 두 클래스에 모두 상속되는 관계이어야함.
public class RabbitFarm<T extends Rabbit> { //클래스와 인터페이스 상속
    private T animal;

    public void setAnimal(T animal){
        this.animal = animal;
    }
    public T getAnimal(){
        return this.animal;
    }

    public RabbitFarm(){}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }
}
