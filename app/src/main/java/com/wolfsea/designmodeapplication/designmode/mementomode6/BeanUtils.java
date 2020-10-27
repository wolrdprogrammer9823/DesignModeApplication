package com.wolfsea.designmodeapplication.designmode.mementomode6;

import java.util.HashMap;

/**
 * @author liuliheng
 * @desc 实体工具类
 * @time 2020/10/27  23:16
 **/
public class BeanUtils {

    public static HashMap<String, Object> backProp(Object bean) {

        HashMap<String, Object> result = new HashMap<>();
        try {

            //存储Bean对象及其属性
        } catch (Exception e) {

            e.printStackTrace();
        }

        return result;
    }

    public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
        //设置Bean对象及其属性
    }

}
