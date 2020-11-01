package com.wolfsea.designmodeapplication.designmode.flyweightmode3;

/**
 * @author liuliheng
 * @desc  抽象蝇量类
 * @time 2020/11/1  11:20
 **/
public abstract class FlyWeight {

    //内部状态
    private String intrinsic;

    //外部状态
    protected final String extrinsic;

    //外部状态必须传入
    public FlyWeight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operation();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
