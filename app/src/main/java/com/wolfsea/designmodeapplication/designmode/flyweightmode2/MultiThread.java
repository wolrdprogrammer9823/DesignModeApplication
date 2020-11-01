package com.wolfsea.designmodeapplication.designmode.flyweightmode2;

/**
 * @author liuliheng
 * @desc 多线程
 * @time 2020/11/1  11:34
 **/
public class MultiThread extends Thread {

    private SignInfo signInfo;

    public MultiThread(SignInfo signInfo) {

        this.signInfo = signInfo;
    }

    @Override
    public void run() {

        super.run();
        boolean contentNotEquals = !signInfo.getId().equals(signInfo.getLocation());
        if (contentNotEquals) {

            System.out.println("编号:" + signInfo.getId());
            System.out.println("考试地址:" + signInfo.getLocation());
            System.out.println("线程不安全了...");
        }
    }
}
