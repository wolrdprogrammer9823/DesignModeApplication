package com.wolfsea.designmodeapplication.designmode.factorymethod3;

import com.wolfsea.designmodeapplication.designmode.factorymethod.BlackHuman;
import com.wolfsea.designmodeapplication.designmode.factorymethod.IHuman;
import com.wolfsea.designmodeapplication.designmode.factorymethod.WhiteHuman;
import com.wolfsea.designmodeapplication.designmode.factorymethod.YellowHuman;

public class Client3 {

    public static void main(String[] args) {

        IHuman human = HumanFactory3.createHuman(YellowHuman.class);
        human.getColor();
        human.talk();

        human = HumanFactory3.createHuman(WhiteHuman.class);
        human.getColor();
        human.talk();

        human = HumanFactory3.createHuman(BlackHuman.class);
        human.getColor();
        human.talk();
    }
}
