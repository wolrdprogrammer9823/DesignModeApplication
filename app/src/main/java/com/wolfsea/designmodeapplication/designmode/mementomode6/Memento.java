package com.wolfsea.designmodeapplication.designmode.mementomode6;

import java.util.HashMap;

/**
 * @author liuliheng
 * @desc  备忘录对象
 * @time 2020/10/27  23:13
 **/
public class Memento {

    private HashMap<String, Object> stateMap;

    public Memento(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
