package com.wolfsea.designmodeapplication.designmode.mementomode5;
import androidx.annotation.NonNull;

/**
 * @author liuliheng
 * @desc 备忘录对象
 * @time 2020/10/27  22:28
 **/
public class Originator implements Cloneable {


    private String state = "";

    private Originator backup;


    public void createOriginator() throws CloneNotSupportedException {
        this.backup = this.clone();
    }

    public void restoreOriginator() {
        if (this.backup == null) {
            throw new NullPointerException("备忘录对象为空!");
        }
        this.setState(this.backup.getState());
    }

    @NonNull
    @Override
    protected Originator clone() throws CloneNotSupportedException {

        return (Originator) super.clone();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
