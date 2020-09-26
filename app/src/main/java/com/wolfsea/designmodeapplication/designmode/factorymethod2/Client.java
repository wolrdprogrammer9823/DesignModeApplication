package com.wolfsea.designmodeapplication.designmode.factorymethod2;
import com.wolfsea.designmodeapplication.designmode.factorymethod.IHuman;

public class Client {

    public static void main(String[] args) {

        YellowHumanFactory yellowHumanFactory = new YellowHumanFactory();
        IHuman human = yellowHumanFactory.createHuman();
        human.getColor();
        human.talk();

        WhiteHumanFactory whiteHumanFactory = new WhiteHumanFactory();
        human = whiteHumanFactory.createHuman();
        human.getColor();
        human.talk();

        BlackHumanFactory blackHumanFactory = new BlackHumanFactory();
        human = blackHumanFactory.createHuman();
        human.getColor();
        human.talk();
    }
}
