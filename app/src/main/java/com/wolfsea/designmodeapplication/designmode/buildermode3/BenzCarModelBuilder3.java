package com.wolfsea.designmodeapplication.designmode.buildermode3;

import java.util.ArrayList;

public class BenzCarModelBuilder3 extends CarModelBuilder3 {

    private BenzCarModel3 benzCarModel = new BenzCarModel3();

    @Override
    protected CarModel3 getCarModel() {
        return benzCarModel;
    }

    @Override
    protected void setSequence(ArrayList<String> sequenceList) {
        benzCarModel.setSequenceList(sequenceList);
    }
}
