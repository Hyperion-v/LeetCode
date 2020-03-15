package com.example.demo.t;

import java.util.Arrays;
import java.util.stream.Collectors;

public class T {
    public  static  void  f1(){
        int[] arr= {8, 2, 4, 6, 3, 1, 5, 7, 9};
        //stream排序
        Arrays.asList(arr).stream().sorted().collect(Collectors.toList());
        //简易冒泡
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<i-j-1;j++){
                if (arr[j]<arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }

            }
        }
    }
//    public  static  void  f2(){
//        HashMap
//    }



}
