package com.wolfsea.designmodeapplication.designmode.observermode;

/**
 * @author liuliheng
 * @desc  线程类
 * @time 2020/10/25  10:25
 **/
public class Spy extends Thread {

    private HanFeiZhi hanFeiZhi;
    private LiShi liShi;
    private String type;

    public Spy(HanFeiZhi hanFeiZhi, LiShi liShi, String type) {
        this.hanFeiZhi = hanFeiZhi;
        this.liShi = liShi;
        this.type = type;
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            if (this.type.equals(Constants.HAVE_BREAKFAST)) {
                if (this.hanFeiZhi.isHavingBreakfast()) {

                    this.hanFeiZhi.setHavingBreakfast(false);
                    this.liShi.update("吃早饭...");
                }

                System.out.println("fun fun fun...");
            } else {
                if (this.hanFeiZhi.isHavingFun()) {

                    this.hanFeiZhi.setHavingFun(false);
                    this.liShi.update("在娱乐...");
                }
            }

        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
