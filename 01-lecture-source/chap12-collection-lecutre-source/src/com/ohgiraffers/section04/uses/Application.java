package com.ohgiraffers.section04.uses;

public class Application {

    public static void main(String[] args) { //s 메인 함수 호출(여기서 프로그램시작)
        MusicMenu musicMenu = new MusicMenu(); //s musicMenu 객체생성 - new 기본생성자로 호출
        musicMenu.mainMenu(); //musicMenu의 mainMenu함수 호출 : ctrl누른채로 mainMenu(); 클릭해서 흐름 따라가기
    }
}
