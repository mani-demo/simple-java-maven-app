package com.mycompany.app;

/**
 * Hello world!
 Test process for build trigger
 */
public class App
{

    private final String message = "Hello World! github access token added";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
