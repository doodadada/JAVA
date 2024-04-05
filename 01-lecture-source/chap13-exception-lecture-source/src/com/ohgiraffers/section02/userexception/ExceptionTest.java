package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest  {
    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
    //위에 우리가 임의로 만든 exception들을 여러개 thorws 한것을 아래처럼 상위 클래스인 exception만 throws해도 된다.
    //public void checkEnoughMoney(int price, int money) throws Exception {
        if(price < 0){
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
        }
        if(money < 0){
            throw new MoneyNegativeException("보유 금액은 음수일 수 없습니다.");
        }
        if(price>money){
            throw new NotEnoughMoneyException("구매하기 위한 금액이 부족합니다.");
        }
        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 되세요~");
    }
}
