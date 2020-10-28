package com.wolfsea.designmodeapplication.designmode.visitormode6;

/**
 * @author liuliheng
 * @desc 角色实现类
 * @time 2020/10/29  1:15
 **/
public class IdiotRole implements Role {
    @Override
    public void accept(AbstractActor abstractRole) {
        abstractRole.act(this);
    }
}
