package com.wolfsea.designmodeapplication.designmode.visitormode6;

/**
 * @author liuliheng
 * @desc 老年演员
 * @time 2020/10/29  1:22
 **/
public class OldActor extends AbstractActor {

    @Override
    public void act(KongFuRole role) {

        System.out.println("年纪大了,演不动了...");
    }
}
