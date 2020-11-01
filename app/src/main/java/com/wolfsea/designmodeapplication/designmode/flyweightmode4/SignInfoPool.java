package com.wolfsea.designmodeapplication.designmode.flyweightmode4;

/**
 * @author liuliheng
 * @desc 实体类--池对象
 * @time 2020/11/1  10:59
 **/
public class SignInfoPool extends SignInfo {

    private ExtrinsicState extrinsicState;

    public SignInfoPool(ExtrinsicState extrinsicState) {
        this.extrinsicState = extrinsicState;
    }

    @Override
    public ExtrinsicState getExtrinsicState() {
        return extrinsicState;
    }

    @Override
    public void setExtrinsicState(ExtrinsicState extrinsicState) {
        this.extrinsicState = extrinsicState;
    }
}
