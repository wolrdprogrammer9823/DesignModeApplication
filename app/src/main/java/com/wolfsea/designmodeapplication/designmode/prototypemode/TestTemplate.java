package com.wolfsea.designmodeapplication.designmode.prototypemode;
import java.util.Random;

public class TestTemplate {

    public static void main(String[] args) {

        final int MAIL_COUNT = 6;

        for (int i = 0; i < MAIL_COUNT; i++) {

            Mail mail = new Mail(new AdvTemplate());
            mail.setAppelation("xxx你好我也好:");
            mail.setReceiver(getRandomContent(5) + "@" + getRandomContent(3) + ".com");
            sendMail(mail);
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
