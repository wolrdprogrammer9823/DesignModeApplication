package com.wolfsea.designmodeapplication.designmode.compositemode3;
import java.util.ArrayList;

public class Branch extends AbsBranch {

    private final ArrayList<Crop> subOrdinateInfo = new ArrayList<>();

    public Branch(String name, String jobPosition, int salary) {
        super(name, jobPosition, salary);
    }

    @Override
    public void add(Crop crop) {
        crop.setParent(this);
        subOrdinateInfo.add(crop);
    }

    @Override
    public ArrayList<Crop> getSubOrdinateInfo() {
        return subOrdinateInfo;
    }
}
