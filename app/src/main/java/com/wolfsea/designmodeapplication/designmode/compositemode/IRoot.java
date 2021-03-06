package com.wolfsea.designmodeapplication.designmode.compositemode;
import java.util.ArrayList;

public interface IRoot {

    String getInfo();

    void add(IBranch branch);

    void add(ILeaf leaf);

    ArrayList getSubOrdinateInfo();
}
