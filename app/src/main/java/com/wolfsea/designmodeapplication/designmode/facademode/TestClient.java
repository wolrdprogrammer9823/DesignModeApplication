package com.wolfsea.designmodeapplication.designmode.facademode;

/**
 * @author liuliheng
 * @desc  测试类
 * @time 2020/10/25  20:39
 **/
public class TestClient {

    public static void main(String[] args) {

        ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("家里一切安好...");
        letterProcess.fillEnvelopeAddress("西安");
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();

    }
}
