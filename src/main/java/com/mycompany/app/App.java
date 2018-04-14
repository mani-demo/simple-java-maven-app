package com.mycompany.app;

/**
 * Hello world!
 To test CI/CD
 added triggers
 Webhook trigger test
 testing done for trigger
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
