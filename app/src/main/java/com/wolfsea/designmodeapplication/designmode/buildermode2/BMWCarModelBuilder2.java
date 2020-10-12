package com.wolfsea.designmodeapplication.designmode.buildermode2;

import java.util.ArrayList;

public class BMWCarModelBuilder2 extends CarModelBuilder2 {

    private CarModel2 carModel2 = new BMWCarModel2();

    @Override
    protected CarModel2 getCarModel() {

        return carModel2;
    }

    @Override
    protected void setSequence(ArrayList<String> sequenceList) {

        carModel2.setSequenceList(sequenceList);
    }
}
