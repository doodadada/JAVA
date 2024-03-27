package com.ohgiraffers.ggujukggujuk;

public class CollatzNum {

        public int solution(int num) {
            int answer = 0;
            int count = 0;
            while(num!=1){
                num = ((num%2)!=0) ? (num*3)+1 : num/2;
                count++;
                System.out.println(count+"번째 시도결과 : "+num);
            }
            answer = (count<=500) ? count : -1;
            return answer;
    }

}
