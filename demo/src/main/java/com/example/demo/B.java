package com.example.demo;

public class B extends A {

     static{
        System.out.println("B的静态方法");
    }
    public B() {
        System.out.println("B的构造方法");
    }

    @Override
    public void m(){
        System.out.println("B的M方法");
    }

    public void A(){
        System.out.println("B的M方法");
    }
    public static void main(String[] args) {

//        B b=new B();
//        b.m();

        A a=new A();
        a.m();
        a=new B();
        a.m();
    }
}
