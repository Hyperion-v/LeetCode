package com.company.topk;

import java.util.*;

public class topkHeap {
    //利用堆来解决topk的问题
    public  static  List<Integer> solutionByHeap(int[] input, int k) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new PriorityQueue<>();
        for (int num : input) {
            if (queue.size() < k) {
                queue.add(num);
            } else if (queue.peek() < num){
                queue.poll();
                queue.add(num);
            }
        }
        while (k-- > 0) {
            list.add(queue.poll());
        }
        return list;
    }
    public static void main(String []args){
        int[] a = {11,9,5,13,7,3,6,1,16,1};
        int k=2;
        List<Integer> list= solutionByHeap(a,k);
        System.out.println(list.toString());
        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
    }
}
