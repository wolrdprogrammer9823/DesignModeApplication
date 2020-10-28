package com.wolfsea.designmodeapplication.designmode.visitormode6;

/**
 * @author liuliheng
 * @desc  抽象角色
 * @time 2020/10/29  1:16
 **/
public abstract class AbstractActor {

    public void act(Role role) {
        System.out.println("演员可以扮演任何角色...");
    }

    public void act(KongFuRole kongFuRole) {
        System.out.println("演员都可以演功夫角色...");
    }

    public void act(IdiotRole idiotRole) {
        System.out.println("演员都可以演弱智角色...");
    }
}
