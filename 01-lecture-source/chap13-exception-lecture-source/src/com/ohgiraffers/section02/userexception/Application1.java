package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            //et.checkEnoughMoney(10000,10000);
            //et.checkEnoughMoney(-50000,10000);
            //et.checkEnoughMoney(50000,-10000);
            et.checkEnoughMoney(50000,10000);

        } catch (Exception e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
