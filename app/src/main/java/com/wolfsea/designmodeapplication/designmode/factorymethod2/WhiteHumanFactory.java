package com.wolfsea.designmodeapplication.designmode.factorymethod2;
import com.wolfsea.designmodeapplication.designmode.factorymethod.IHuman;
import com.wolfsea.designmodeapplication.designmode.factorymethod.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory2 {

    @Override
    public IHuman createHuman() {
        return new WhiteHuman();
    }
}
