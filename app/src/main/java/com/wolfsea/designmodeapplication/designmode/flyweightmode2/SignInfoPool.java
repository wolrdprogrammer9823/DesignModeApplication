package com.wolfsea.designmodeapplication.designmode.flyweightmode2;

/**
 * @author liuliheng
 * @desc 实体类--池对象
 * @time 2020/11/1  10:59
 **/
public class SignInfoPool extends SignInfo {

    private String key;

    public SignInfoPool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
