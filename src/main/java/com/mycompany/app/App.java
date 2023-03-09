package com.mycompany.app;

import java.util.Random;
import java.util.concurrent.TimeUnit;



public class App {

    private static final String MESSAGE = "live demonstration 9.3.2023";

    public App() {}

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread() {
        @Override
            public void run() {
                System.out.println("Terminate signal received, exiting");
            }   
        }); 
        Random randomNum = new Random();
        int sheepCount = randomNum.nextInt(1000)+100;
        System.out.println("Going to count " + sheepCount + "sheep");
        for (int i = 0; i < sheepCount; i++) {
            System.out.println(i + "sheep");
            try {
                TimeUnit.SECONDS.sleep(10);            
            }
            catch (InterruptedException e) {
            System.out.println("Interrupted "
                               + "while Sleeping");
            }
        }
    }
        
    public String getMessage() {
        return MESSAGE;
    }
}
