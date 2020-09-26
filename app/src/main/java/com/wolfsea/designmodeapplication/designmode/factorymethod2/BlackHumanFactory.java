package com.wolfsea.designmodeapplication.designmode.factorymethod2;
import com.wolfsea.designmodeapplication.designmode.factorymethod.BlackHuman;
import com.wolfsea.designmodeapplication.designmode.factorymethod.IHuman;

public class BlackHumanFactory extends AbstractHumanFactory2 {

    @Override
    public IHuman createHuman() {
        return new BlackHuman();
    }
}
