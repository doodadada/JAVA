package com.ohgiraffers.bingo;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("빙고판 크기 지정 : ");
        int size = sc.nextInt();
        /* 랜덤숫자의 값을 부여하기 위해 배열을 하나 만들고 길이를 빙고 크기의 제곱으로 만들어 준다.*/
        int[][] map = new int[size][size];

        /* for문을 통해서 각각의 배열에 랜덤 한 값을 입력하고 잘 입력됬는지 먼저 확인해보기 */
        Random r = new Random();
//        int row = r.nextInt(size); //0~()안의 값까지 중에서 랜덤으로 하나의 정수값을 반환
//        int col = r.nextInt(size);
//
//        map[row][col] = 1;

        System.out.println("=======빙고 게임 시작=======");
        int num = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                while (true) {
                    boolean isDuplication = false;
                    num = r.nextInt(size * size) + 1;
                    duplication:
                    for (int k = 0; k < size; k++) {
                        for (int l = 0; l < size; l++) {
                            if (map[k][l] == num) {
                                isDuplication = true;
                                break duplication;
                            }
                        }
                    }
                    if (!isDuplication) {
                        map[i][j] = num;
                        System.out.print('\t');
                        System.out.print(map[i][j]);
                        break;
                    }
                }
            }
            System.out.println("");
        }
        int remain = size*size;
        while(remain!=0){
            System.out.print("숫자 선택 : ");
            num = sc.nextInt();
            if (1<=num && num<=size*size){
                for(int i = 0; i<size;i++){
                    for(int j = 0; j<size; j++){
                        if(map[i][j]==num) {
                            map[i][j]=0;
                            System.out.print(map[i][j]);
                            System.out.print('\t');
                            remain--;
                        }else{
                            System.out.print(map[i][j]);
                            System.out.print('\t');
                        }
                    }
                    System.out.println("");
                }
            }else{
                System.out.println("1부터"+(size*size)+" 사이의 숫자를 다시 입력하세요");
            }
        }
        System.out.println("빙고끝");


    }
}
