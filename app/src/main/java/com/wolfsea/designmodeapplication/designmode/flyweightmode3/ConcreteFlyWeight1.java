package com.wolfsea.designmodeapplication.designmode.flyweightmode3;

/**
 * @author liuliheng
 * @desc 具体蝇量实体类
 * @time 2020/11/1  11:23
 **/
public class ConcreteFlyWeight1 extends FlyWeight {

    public ConcreteFlyWeight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operation() {
        //执行业务逻辑
    }
}
