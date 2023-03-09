import java.util.Random;
import java.lang.Thread;  
package com.mycompany.app;


/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World! live demonstration 3.3.2023";

    public App() {}

    public static void main(String[] args) {
        Random randomNum = new Random();
        int showMe = randomNum.nextInt(100);
        System.out.println("Random number between 1 and 100: " + showMe);
        for (int i = 0; i < 50; i++) {
            System.out.println(MESSAGE);
            sleep(randomNum.nextInt(10000));
        }
    }

    public String getMessage() {
        return MESSAGE;
    }
}
