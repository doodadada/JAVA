package com.ohgiraffers.section02.extend;

public class WildCardFarm {
    /* 매개변수로 전달받는 토끼농장을 구현할 때 사용한 타입 변수에 대해 제한할 수 있다. */
    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    public void extendsType(RabbitFarm<? extends Bunny> farm){ //상한제한이 bunny이기 때문에 bunny, 그 후손인 drunkenbunny만 가능(drunkenbunny의 후손이 있다면 그 아래로 계속 가능)
        farm.getAnimal().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm){ //하한제한이 bunny, 인풋이 rabbitfarm이기때문에 bunny,rabbit까지만 가능

    }
}
