package com.wolfsea.designmodeapplication.designmode.compositemode3;

import java.util.ArrayList;

public abstract class AbsBranch extends Crop {

    public AbsBranch(String name, String jobPosition, int salary) {
        super(name, jobPosition, salary);
    }

    public abstract void add(Crop crop);

    public abstract ArrayList<Crop> getSubOrdinateInfo();
}
