package com.example.tutorial;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello("cs427"));
    }

    public static String sayHello(String who) {
        if (who == null) return "Hello, stranger!";
        return "Hello, " + who + "!";
    }
}
