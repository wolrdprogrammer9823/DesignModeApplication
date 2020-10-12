package com.wolfsea.designmodeapplication.designmode.buildermode3;
import java.util.ArrayList;

public abstract class CarModel3 {

    private ArrayList<String> sequenceList;

    protected abstract void start();

    protected abstract void engineBoom();

    protected abstract void ring();

    protected abstract void stop();

    public final void run() {

        if (sequenceList == null) {

            throw new NullPointerException("操作指导列表不能为空...");
        }

        final int steps = sequenceList.size();

        for (int i = 0; i < steps; i++) {

            final String operationStep = sequenceList.get(i);
            switch (operationStep) {
                case CarOperationStep3.START: {
                    start();
                    break;
                }
                case CarOperationStep3.RING: {
                    ring();
                    break;
                }
                case CarOperationStep3.ENGINE_BOOM: {
                    engineBoom();
                    break;
                }
                case CarOperationStep3.STOP: {
                    stop();
                    break;
                }
                default:
                    break;
            }
        }
    }

    public void setSequenceList(ArrayList<String> sequenceList) {
        this.sequenceList = sequenceList;
    }
}
