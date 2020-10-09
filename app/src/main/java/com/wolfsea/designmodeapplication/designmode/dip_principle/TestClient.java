package com.wolfsea.designmodeapplication.designmode.dip_principle;

public class TestClient {

    public static void main(String[] args) {

        ICar car = new Benz();

        IDriver driver = new Tom();
        driver.drive(car);

        System.out.println("========================");

        car = new BMW();
        driver.drive(car);
    }
}
