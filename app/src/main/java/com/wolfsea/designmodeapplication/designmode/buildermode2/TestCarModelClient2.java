package com.wolfsea.designmodeapplication.designmode.buildermode2;
import java.util.ArrayList;

public class TestCarModelClient2 {

    public static void main(String[] args) {

        ArrayList<String> sequenceList = new ArrayList<>();
        sequenceList.add(CarOperationStep2.START);
        sequenceList.add(CarOperationStep2.ENGINE_BOOM);
        sequenceList.add(CarOperationStep2.RING);
        sequenceList.add(CarOperationStep2.STOP);

        CarModelBuilder2 carModelBuilder2 = new BenzCarModelBuilder2();
        carModelBuilder2.setSequence(sequenceList);
        CarModel2 carModel2 = carModelBuilder2.getCarModel();
        carModel2.run();

        System.out.println("===========================");

        carModelBuilder2 = new BMWCarModelBuilder2();
        carModelBuilder2.setSequence(sequenceList);
        carModel2 = carModelBuilder2.getCarModel();
        carModel2.run();
    }
}
