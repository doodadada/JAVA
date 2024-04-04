package com.ohgiraffers.teamStudy.polymorphism.js;

public class Application {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Animal();
        animals[1] = new Tiger();
        animals[2] = new Panda();
        animals[3] = new Dog();

        for(Animal a : animals){
            a.cry();
        }


    }
}
