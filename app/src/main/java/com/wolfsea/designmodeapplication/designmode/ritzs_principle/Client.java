package com.wolfsea.designmodeapplication.designmode.ritzs_principle;

public class Client {

    public static void main(String[] args) {

        Soldier tom = new Soldier();
        tom.setGun(new MachineGun());
        tom.killEnemy();

        tom.setGun(new RifleGun());
        tom.killEnemy();


        tom.setGun(new ToyGun());
        tom.killEnemy();

    }
}
