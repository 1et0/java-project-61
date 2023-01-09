package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static void greetGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        String name = Cli.getName();
    }
}
