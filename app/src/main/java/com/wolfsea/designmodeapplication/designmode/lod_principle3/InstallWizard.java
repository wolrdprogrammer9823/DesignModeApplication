package com.wolfsea.designmodeapplication.designmode.lod_principle3;

/**
 * @author liuliheng
 * @desc  实体类
 * @time 2020/11/3  0:14
 **/
public class InstallWizard {

    public void installWizard(Wizard wizard) {

        int first = wizard.first();

        if (first > 50) {

            int second = wizard.second();

            if (second > 10) {

                wizard.next();
            }
        }
    }
}
