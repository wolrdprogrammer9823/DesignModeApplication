package com.wolfsea.designmodeapplication.designmode.abstractfactory1;

public class MaleHumanFactory implements HumanFactory {

    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
