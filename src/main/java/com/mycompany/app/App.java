package com.mycompany.app;

/**
 * Hello world!
 To test CI/CD
 added triggers
 Added update on 14/04/2018
 */
public class App
{

    private final String message = "Hello World! Jenkins build success test on trigger";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
