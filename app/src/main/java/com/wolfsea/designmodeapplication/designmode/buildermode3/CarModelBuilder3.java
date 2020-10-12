package com.wolfsea.designmodeapplication.designmode.buildermode3;
import java.util.ArrayList;

public abstract class CarModelBuilder3 {

   protected abstract CarModel3 getCarModel();

   protected abstract void setSequence(ArrayList<String> sequenceList);
}
