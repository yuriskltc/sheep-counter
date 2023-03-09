package com.mycompany.app;

import java.util.Random;
import java.util.concurrent.TimeUnit;



/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World! live demonstration 3.3.2023";

    public App() {}

    public static void main(String[] args) {
        Runtime.getRuntime().addShutdownHook(new Thread() {
        @Override
            public void run() {
                System.out.println("Terminate signal received, exiting");
            }   
        }); 
        Random randomNum = new Random();
        int showMe = randomNum.nextInt(100);
        System.out.println("Random number between 1 and 100: " + showMe);
        for (int i = 0; i < 50; i++) {
            System.out.println(MESSAGE);
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
