package com.wolfsea.designmodeapplication.designmode.facademode2;

/**
 * @author liuliheng
 * @desc
 * @time 2020/10/25  20:47
 **/
public class ModernPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address) {

        letterProcess.writeContext(context);
        letterProcess.fillEnvelopeAddress(address);
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
