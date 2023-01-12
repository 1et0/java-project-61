package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void evenGame() {

        String name = Cli.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int countCorrect = 0;
        while (countCorrect < GameOptions.VALUE_CORRECT_ANSWER) {
            int rndNum = GameOptions.rndNum();
            System.out.println("Question: " + rndNum);
            String answer = answerQuestions();
            System.out.println("Your answer: " + answer);

            if (responseCheck(answer, rndNum)) {
                System.out.println("Correct!");
                countCorrect++;
            } else {
                String answerInvert = answerInverse(answer);
                System.out.println("'" + answer
                        + "' is wrong answer ;(. Correct answer was '"
                        + answerInvert + "'.");
                break;
            }
        }

        if (countCorrect == GameOptions.VALUE_CORRECT_ANSWER) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }

    private static boolean responseCheck(String answer, int rndNum) {
        if (rndNum % 2 == 0 && answer.equals("yes")) {
            return true;
        } else if (rndNum % 2 != 0 && answer.equals("no")) {
            return true;
        } else if (rndNum % 2 == 0 && answer.equals("no")) {
            return false;
        } else if (rndNum % 2 != 0 && answer.equals("yes")) {
            return false;
        }
        return false;
    }

    private static String answerQuestions() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        return answer;
    }

    private static String answerInverse(String answer) {
        if (answer.equals("yes")) {
            return "no";
        } else {
            return "yes";
        }
    }
}
