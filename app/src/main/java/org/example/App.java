package org.example;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Java application started!");

        while (true) {
            System.out.println("Application is running...");
            Thread.sleep(10000);
        }
    }
}
