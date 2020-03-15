package com.example.demo;

public class T {


    public static void main(String[] args) {
        String s="123456789AZaz";
        char[]c=s.toCharArray();
        for (char c1:c){
           int i= c1;
   //         System.out.println(i);
           if(i<=57){
               System.out.println(c1);
           }

        }

    }
}
