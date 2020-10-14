package com.wolfsea.designmodeapplication.designmode.prototypemode4;

public class TestAnyThing {

    public static void main(String[] args) {

        //浅拷贝  vs 深拷贝
        //浅拷贝:Object类提供的clone()方法只拷贝对象,对象内部的数组、引用对象都不拷贝,还是指向原生对象的内部元素地址.
        //深拷贝:在clone()方法中添加对对象内部的数组拷贝、应用对象的拷贝.
        //被final修饰的对象是不能被clone的
        AnyThing anyThing = new AnyThing();
        anyThing.setValue("value");

        AnyThing cloneAnyThing = anyThing.clone();
        cloneAnyThing.setValue("value2");

        System.out.println(anyThing.getArrayList());

        System.out.println("===================================");

        System.out.println(cloneAnyThing.getArrayList());
    }
}
