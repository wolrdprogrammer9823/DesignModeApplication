package com.wolfsea.designmodeapplication.designmode.prototypemode2;
import java.util.Random;

public class TestTemplate {

    public static void main(String[] args) throws CloneNotSupportedException {

        final int MAIL_COUNT = 6;
        Mail mail = new Mail(new AdvTemplate());
        for (int i = 0; i < MAIL_COUNT; i++) {

            Mail cloneMail = mail.clone();
            cloneMail.setAppelation("xxx你好我也好:");
            cloneMail.setReceiver(getRandomContent(5) + "@" + getRandomContent(3) + ".com");
            sendMail(cloneMail);

        }
    }


    public static void sendMail(Mail mail) {
        System.out.println("发送的内容为:" + mail.getSubject() + ",接收者为:" + mail.getReceiver());
    }

    public static String getRandomContent(int maxLength) {

        final String CONTENT = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        final int CONTENT_LENGTH = CONTENT.length();

        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {

            builder.append(CONTENT.charAt(random.nextInt(CONTENT_LENGTH)));
        }

        return builder.toString();
    }
}
