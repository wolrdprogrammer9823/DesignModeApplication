package com.wolfsea.designmodeapplication.designmode.facademode3;

/**
 * @author liuliheng
 * @desc 实现类
 * @time 2020/10/25  20:37
 **/
public class LetterProcessImpl implements ILetterProcess {

    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容:" + context);
    }

    @Override
    public void fillEnvelopeAddress(String address) {
        System.out.println("填写收件人姓名及地址:" + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放入信封...");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件...");
    }
}
