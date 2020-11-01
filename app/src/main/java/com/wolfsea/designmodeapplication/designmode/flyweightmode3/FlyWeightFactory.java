package com.wolfsea.designmodeapplication.designmode.flyweightmode3;
import java.util.HashMap;

/**
 * @author liuliheng
 * @desc  蝇量工厂类
 * @time 2020/11/1  11:26
 **/
public class FlyWeightFactory {

    private static final HashMap<String, FlyWeight> POOL_MAP = new HashMap<>();

    public static FlyWeight createFlyWeight(String extrinsic) {

        FlyWeight flyWeight;

        boolean notContainsKey = !POOL_MAP.containsKey(extrinsic);
        if (notContainsKey) {

            flyWeight = new ConcreteFlyWeight1(extrinsic);
        } else {

            flyWeight = POOL_MAP.get(extrinsic);
        }

        return flyWeight;
    }

}
