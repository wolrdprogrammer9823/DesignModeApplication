package com.wolfsea.designmodeapplication.designmode.compositemode2;
import java.util.ArrayList;

public interface IBranch extends ICrop {

    void add(ICrop crop);

    ArrayList<ICrop> getSubOrdinateInfo();
}
