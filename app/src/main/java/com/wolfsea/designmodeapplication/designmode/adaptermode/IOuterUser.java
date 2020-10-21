package com.wolfsea.designmodeapplication.designmode.adaptermode;
import java.util.Map;

public interface IOuterUser {

    Map<String,String> getUserHomeInfo();

    Map<String,String> getUserBaseInfo();

    Map<String,String> getUserOfficeInfo();
}
