package com.driver;

public class Main {
    public static void main(String[] args) {
        A obj= new A();
        obj.meth();
        A obj1= new B();
        obj1.meth();

    }
}
class A{
        void meth(){
            System.out.println("Invoking method from class A");
        }
}
class B extends A{
        void meth(){
            System.out.println("Method is overridden in Extendend class B");
        }
}