package com.example.tutorial;
import com.github.ricksbrown.cowsay.Cowsay;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(cowsayHello("cs427"));
    }

    public static String cowsayHello(String who) {
        String[] args = new String[]{sayHello(who)};
        String result = Cowsay.say(args);
		return result;
    }

    public static String sayHello(String who) {
        if (who == null) return "Hello, stranger!";
        return "Hello, " + who + "!";
    }
}
