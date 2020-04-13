package com.frank;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MailService mailService = new MailService();
        mailService.sendAsync();
        System.out.println("Hello");
        Thread.sleep(5000);
    }
}
