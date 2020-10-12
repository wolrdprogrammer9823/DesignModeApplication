package com.wolfsea.designmodeapplication.designmode.buildermode2;

import java.util.ArrayList;

public abstract class CarModelBuilder2 {

    protected abstract CarModel2 getCarModel();

    protected abstract void setSequence(ArrayList<String> sequenceList);
}
