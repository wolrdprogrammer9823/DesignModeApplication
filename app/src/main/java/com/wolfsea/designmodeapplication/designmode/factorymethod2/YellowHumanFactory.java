package com.wolfsea.designmodeapplication.designmode.factorymethod2;
import com.wolfsea.designmodeapplication.designmode.factorymethod.IHuman;
import com.wolfsea.designmodeapplication.designmode.factorymethod.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory2 {

    @Override
    public IHuman createHuman() {

        return new YellowHuman();
    }
}

