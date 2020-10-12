package com.wolfsea.designmodeapplication.designmode.buildermode3;
import java.util.ArrayList;

public class BMWCarModelBuilder3 extends CarModelBuilder3 {

    private BMWCarModel3 bmwCarModel = new BMWCarModel3();

    @Override
    protected CarModel3 getCarModel() {
        return bmwCarModel;
    }

    @Override
    protected void setSequence(ArrayList<String> sequenceList) {
        bmwCarModel.setSequenceList(sequenceList);
    }
}
