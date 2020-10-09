package com.wolfsea.designmodeapplication.designmode.abstractfactory1;

public class TestClient {

    public static void main(String[] args) {

        HumanFactory humanFactory = new FemaleHumanFactory();
        Human human = humanFactory.createYellowHuman();
        printResult(human);

        System.out.println("===================");

        humanFactory = new MaleHumanFactory();
        human = humanFactory.createBlackHuman();
        printResult(human);

        System.out.println("===================");

        humanFactory = new FemaleHumanFactory();
        human = humanFactory.createWhiteHuman();
        printResult(human);
    }


    public static void printResult(Human human) {

        System.out.print("颜色:");
        human.getColor();

        System.out.print("性别:");
        human.getSex();

        System.out.print("语言:");
        human.talk();
    }
}
