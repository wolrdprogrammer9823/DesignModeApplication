package com.wolfsea.designmodeapplication.designmode.facademode;

/**
 * @author liuliheng
 * @desc  信件处理接口
 * @time 2020/10/25  20:36
 **/
public interface ILetterProcess {

    void writeContext(String context);

    void fillEnvelopeAddress(String address);

    void letterIntoEnvelope();

    void sendLetter();
}
