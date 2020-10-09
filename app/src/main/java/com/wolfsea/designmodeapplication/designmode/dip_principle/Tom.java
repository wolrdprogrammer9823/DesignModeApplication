package com.wolfsea.designmodeapplication.designmode.dip_principle;

public class Tom implements IDriver {
    @Override
    public void drive(ICar car) {
        car.run();
    }
}
