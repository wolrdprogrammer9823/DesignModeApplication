package com.wolfsea.designmodeapplication.designmode.mementomode7;

/**
 * @author liuliheng
 * @desc  备忘录管理者
 * @time 2020/10/27  23:45
 **/
public class CareTaker {

    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
