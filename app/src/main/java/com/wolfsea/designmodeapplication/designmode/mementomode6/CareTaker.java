package com.wolfsea.designmodeapplication.designmode.mementomode6;

import java.util.HashMap;

/**
 * @author liuliheng
 * @desc  备忘录管理者
 * @time 2020/10/27  23:25
 **/
public class CareTaker {

    private HashMap<String, Memento> mementoHashMap = new HashMap<>();

    public void setMemento(String idx, Memento memento) {

        mementoHashMap.put(idx, memento);
    }

    public Memento getMemento(String idx) {

        return mementoHashMap.get(idx);
    }
}
