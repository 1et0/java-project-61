package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("2 - Even");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");

        int gameNumber = scanner.nextInt();
        switch (gameNumber) {
            case 2:
                System.out.println("Your choice: " + gameNumber);
                Even.evenGame();
                break;
            case 1:
                System.out.println("Your choice: " + gameNumber);
                Greet.greetGame();
                break;
            case 0:
                System.out.println("Your choice: Exit");
                break;
            default:
                System.out.println("Ввели что-то непотребное!!! - " + gameNumber);
                break;
        }
    }
}
