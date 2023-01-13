package com.driver;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        A obj= new A();
        System.out.println(obj.meth());
        A obj1= new B();
        System.out.println(obj1.meth());

    }
}
class A{
        String meth(){
            return "Invoking method from class A";
        }
}
class B extends A{
        String meth(){
            return "Method is overridden in Extendend class B";
        }
}