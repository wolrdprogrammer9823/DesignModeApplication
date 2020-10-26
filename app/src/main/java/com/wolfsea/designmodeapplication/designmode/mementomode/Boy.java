package com.wolfsea.designmodeapplication.designmode.mementomode;

/**
 * @author liuliheng
 * @desc 男孩实体类
 * @time 2020/10/26  23:57
 **/
public class Boy {

    String state;

    public void changeState() {

        this.state = "可能心情不太好...";
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
