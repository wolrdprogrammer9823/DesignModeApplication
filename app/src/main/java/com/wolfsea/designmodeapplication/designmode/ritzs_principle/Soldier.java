package com.wolfsea.designmodeapplication.designmode.ritzs_principle;

public class Soldier  {

    private AbstractGun abstractGun;

    public void setGun(AbstractGun abstractGun) {

        this.abstractGun = abstractGun;
    }

    public void killEnemy() {

        System.out.println("士兵开始杀敌人...");
        this.abstractGun.shoot();
    }
}
