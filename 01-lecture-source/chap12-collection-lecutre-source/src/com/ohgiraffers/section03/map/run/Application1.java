package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
         *  Map 인터페이스의 특징
         *  Collection 인터페이스와 다른 저장방식을 가진다.
         *  키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
         * */
        /*
        *  키(key)란?
        *  값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다
        *  1. 요소의 저장순서를 유지하지 않는다
        *  2. 키는 중복 허용하지 않지만 키가 다르면 중복되는 값을 저장 가능하다.
        * */

        /*
        *  HashMap 검색 속도가 매우 빠르다
        * */

        HashMap hmap = new HashMap(); //객체 생성시 <>을 안해도 됨(모든 타입을 넣을 수 있음을 보이는 예문)

        hmap.put("one",new Date());
        hmap.put(12,"red apple");//hmap안에는 무조건 객체가 들어가야하는데 여기서 12는 자동으로 Integer 객체로 boxing되는 것이다.
        hmap.put(33,123);

        System.out.println("hmap = " + hmap);
        hmap.put(12,"banana"); //기존 있던 키에 다른 value를 넣으면 덮어쓰기가 된다
        System.out.println("hmap = " + hmap);

        hmap.put(11,"banana"); //다른 키에 같은 value를 넣으면 상관없음
        hmap.put(9,"banana");
        System.out.println("hmap = " + hmap);

        System.out.println("키 9의 객체 값 = " + hmap.get(9));
        
        hmap.remove(9);

        System.out.println("hmap = " + hmap.size());
        //hmap.clear();
        //System.out.println("clear 이후 hmap empty여부 = " + hmap.isEmpty());

        System.out.println("=====================");
        HashMap<String,String> hmap2 = new HashMap<>();
        hmap2.put("one","java");
        hmap2.put("two","oracle");
        hmap2.put("three","jdbc");
        hmap2.put("four","html");
        hmap2.put("five","css");

        Iterator<String> keyIter = hmap2.keySet().iterator();

        //Iterator
        while(keyIter.hasNext()){
            String key = (String) keyIter.next();
            String value = (String) hmap2.get(key);
            System.out.println(key + "="+value);
        }

        Collection<String> values = hmap2.values();
        
        Iterator<String> valueIter = values.iterator();
        
        while(valueIter.hasNext()){
            System.out.println("valueIter.next() = " + valueIter.next());
        }

        /* 배열로 만들어서 처리 */
        Object[] valueArr = values.toArray();
        for(int i = 0; i<valueArr.length;i++){
            System.out.println("valueArr["+i+"] = "+valueArr[i]);
        }
        for(Object o : valueArr){
            System.out.println(o);
        }

        /* Entry를 가지고 처리하는 법 : 키와 객체를 쌍으로 묶는 것*/
        Set<Map.Entry<String,String>> set = hmap2.entrySet();
        Iterator<Map.Entry<String,String>> entryIterator = set.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String,String> entry = entryIterator.next();
            System.out.println(entry.getKey());
        }
    }
}
