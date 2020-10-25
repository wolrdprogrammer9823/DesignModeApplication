package com.wolfsea.designmodeapplication.designmode.facademode3;

/**
 * @author liuliheng
 * @desc
 * @time 2020/10/25  20:47
 **/
public class ModernPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police police = new Police();

    public void sendLetter(String context, String address) {

        letterProcess.writeContext(context);
        letterProcess.fillEnvelopeAddress(address);
        letterProcess.letterIntoEnvelope();
        police.checkLetter(letterProcess);
        letterProcess.sendLetter();
    }
}
