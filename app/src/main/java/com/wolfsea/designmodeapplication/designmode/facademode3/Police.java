package com.wolfsea.designmodeapplication.designmode.facademode3;

/**
 * @author liuliheng
 * @desc  检查类
 * @time 2020/10/25  20:54
 **/
public class Police {

    public void checkLetter(ILetterProcess letterProcess) {

        System.out.println("信件已经通过了检查:" + letterProcess);
    }
}
