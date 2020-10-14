package com.wolfsea.designmodeapplication.designmode.prototypemode4;
import androidx.annotation.NonNull;

import java.util.ArrayList;

public class AnyThing implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<>();

    @NonNull
    @Override
    protected AnyThing clone() {
        AnyThing anyThing = null;
        try {
            anyThing = (AnyThing) super.clone();
            anyThing.arrayList = (ArrayList<String >)this.arrayList.clone();
        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }

        return anyThing;
    }

    public void setValue(String value) {

        arrayList.add(value);
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }
}
