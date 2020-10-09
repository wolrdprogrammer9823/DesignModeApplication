package com.wolfsea.designmodeapplication.designmode.ritzs_principle;

public abstract class AbstractToy extends AbstractGun {

    private void toyGunShoot() {
        System.out.println("玩具枪玩游戏...");
    }

    @Override
    public void shoot() {
        toyGunShoot();
    }
}
