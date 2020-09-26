package com.wolfsea.designmodeapplication.designmode.factorymethod;

public class Client {

    public static void main(String[] args) {

        HumanFactory humanFactory = new HumanFactory();

        IHuman human = humanFactory.createHuman(YellowHuman.class);
        human.getColor();
        human.talk();

        human = humanFactory.createHuman(WhiteHuman.class);
        human.getColor();
        human.talk();

        human = humanFactory.createHuman(BlackHuman.class);
        human.getColor();
        human.talk();
    }
}
