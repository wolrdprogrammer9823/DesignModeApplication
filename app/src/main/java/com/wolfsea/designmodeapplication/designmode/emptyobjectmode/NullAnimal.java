package com.wolfsea.designmodeapplication.designmode.emptyobjectmode;

public class NullAnimal implements Animal {
    @Override
    public void makeSound() {
        System.out.println("这是一个空对象...");
    }
}
