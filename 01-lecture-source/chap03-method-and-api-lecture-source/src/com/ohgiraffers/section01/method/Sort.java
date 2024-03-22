package com.ohgiraffers.section01.method;

public class Sort {

    public static void main(String[] args) {
        int[] arr = {1,3,2,45,27,9};
        Sort sort = new Sort();
        int[] sortarr = sort.sort(arr);

        for(int i =0; i<sortarr.length;i++){
            System.out.println(sortarr[i]);
        }
    }


    public int[] sort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                } //if문 종료
            } //j for문 종료
            //스와프
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        } //i for문 종료
        return arr;
    }
}
