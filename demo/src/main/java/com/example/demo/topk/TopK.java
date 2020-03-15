package com.example.demo.topk;

import java.util.Arrays;

public class TopK{
    //没啥卵用的
    int partion(int a[],int first,int end){
        int i=first;
        int main=a[end];
        for(int j=first;j<end;j++){
            if(a[j]<main){
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                i++;
            }
        }
        a[end]=a[i];
        a[i]=main;
        return i;
    }
    void getTopKMinBySort(int a[],int first,int end,int k){
        if(first<end){
            int partionIndex=partion(a,first,end);
             if(partionIndex>k-1) {
                 getTopKMinBySort(a,first,partionIndex-1,k);
             } else {
                 getTopKMinBySort(a,partionIndex+1,end,k);
             }
        }
    }
    public static void main(String []args){
        int[] a = {11,9,5,13,7,3,6,1,16,1};
        int k=2;
        new TopK().getTopKMinBySort(a,0,a.length-1,k);
        System.out.println(Arrays.toString(a));
        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
    }
}
