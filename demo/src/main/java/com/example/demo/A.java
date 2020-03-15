package com.example.demo;

public class A {
     static  {
        System.out.println("A的静态方法");
    }
    public  void m(){
        System.out.println("A的M方法");
    }

    public A() {
        System.out.println("A的构造方法");
    }
    public static void main(String[] args) {
         A a=new A();
         a.m();
    }

    }
