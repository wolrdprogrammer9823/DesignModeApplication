package com.wolfsea.designmodeapplication.designmode.buildermode3;

import java.util.ArrayList;

public class CarDirector3 {

    private BMWCarModelBuilder3 bmwCarModelBuilder3 = new BMWCarModelBuilder3();
    private BenzCarModelBuilder3 benzCarModelBuilder3 = new BenzCarModelBuilder3();

    private ArrayList<String> sequenceList = new ArrayList<>();

    public CarModel3 buildABenCarModel3() {
        sequenceList.clear();
        sequenceList.add(CarOperationStep3.START);
        sequenceList.add(CarOperationStep3.RING);
        sequenceList.add(CarOperationStep3.STOP);
        benzCarModelBuilder3.setSequence(sequenceList);
        return benzCarModelBuilder3.getCarModel();
    }

    public CarModel3 buildBBenCarModel3() {
        sequenceList.clear();
        sequenceList.add(CarOperationStep3.START);
        sequenceList.add(CarOperationStep3.ENGINE_BOOM);
        sequenceList.add(CarOperationStep3.RING);
        sequenceList.add(CarOperationStep3.STOP);
        benzCarModelBuilder3.setSequence(sequenceList);
        return benzCarModelBuilder3.getCarModel();
    }

    public CarModel3 buildCBMWCarModel3() {
        sequenceList.clear();
        sequenceList.add(CarOperationStep3.START);
        sequenceList.add(CarOperationStep3.ENGINE_BOOM);
        sequenceList.add(CarOperationStep3.STOP);
        bmwCarModelBuilder3.setSequence(sequenceList);
        return bmwCarModelBuilder3.getCarModel();
    }


    public CarModel3 buildDBMWCarModel3() {
        sequenceList.clear();
        sequenceList.add(CarOperationStep3.START);
        sequenceList.add(CarOperationStep3.ENGINE_BOOM);
        sequenceList.add(CarOperationStep3.STOP);
        bmwCarModelBuilder3.setSequence(sequenceList);
        return bmwCarModelBuilder3.getCarModel();
    }
}
