package com.company.lock;

import java.util.Arrays;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class aqs extends AbstractQueuedSynchronizer {

    public static void sort(int[] array, int n, int start, int end) {
        //快速排序 n*logn
        int curr = array[end];
        int minLen = 0;
        int i = start;
        while (i < end) {
            if (array[i] < curr) {
                int temp = array[start + minLen];
                array[start + minLen] = array[i];
                array[i] = temp;
                minLen++;
            }
            i++;
        }
        array[end] = array[start + minLen];
        array[start + minLen] = curr;
        sort(array, minLen, start, start + minLen - 1);
        sort(array, n - minLen - 1, start + minLen + 1, end);
    }

    public static int findKth(int[] arr, int k) {
        sort(arr, arr.length, 0, arr.length - 1);
        int kv = 1;
        for (int value : arr) {
            //判断是不是基数
            if (value % 2 == 1) {
                //是不是第k小的
                if (kv == k) {
                    return value;
                }
                kv++;
            }
        }
        return 0;
    }


    public static void main(String[] args) {


        int[] arr = {11, 9, 5, 13, 7, 3, 6, 1, 16};
        int i = findKth(arr, 1);
        System.out.println(i);
//        for(int i = 0; i <= arr.length ; i++){
//            boolean bool = true;
//            for(int j = 0; j < arr.length - i - 1 ; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp= arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    bool = false;
//                }
//            }
//            if(bool){
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
