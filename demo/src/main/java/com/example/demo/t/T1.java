package com.example.demo.t;

public class T1 {
    //99乘法表 某个面试问题
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                int t=j*i;
                System.out.print(i+"*"+j+"="+t+" ");
            }
            System.out.println();
        }
    }
}
