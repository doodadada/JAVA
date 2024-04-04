package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {
        /* 수업목표. extends 키워드를 이용하여 특정한 타입만을 사용하도록 제네릭 범위를 제한할 수 있다. */

        //RabbitFarm<Animal>farm1 = new RabbitFarm<Animal>(); //에러발생
        //RabbitFarm<Mammal>farm2 = new RabbitFarm<Mammal>(); //에러발생
        //RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>(); //에러발생

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        // farm4.getAnimal(new Snake());에러발생

        farm4.setAnimal(new Rabbit());
        ((Rabbit)farm4.getAnimal()).cry(); //강제형변환
        farm4.getAnimal().cry();

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        //farm5.setAnimal((Bunny)(new Rabbit())); 강제형변환도 되는데 예외 처리를 해줘야함
        //farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();
    }
}
