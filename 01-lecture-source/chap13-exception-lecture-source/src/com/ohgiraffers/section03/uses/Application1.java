package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {
        BufferedReader in  = null;  //file을 읽어올 때 쓰는 보조기능을 하는 클래스
        try {
            in = new BufferedReader(new FileReader("test.data"));
            String s;
            while ((s=in.readLine()) !=null){
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                /*
                *  NullPointerException 발생
                *  null를 참조하는 상태에서 참조 연산자를 사용시 발생하는 예외이다.
                * */
                if(in != null){
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
