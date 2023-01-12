package hexlet.code;

public class Calc {
    public static void calcGame() {

        String name = Cli.getName();
        System.out.println("What is the result of the expression?");

        int countCorrect = 0;
        while (countCorrect < GameOptions.VALUE_CORRECT_ANSWER) {
            int rndNumA = GameOptions.rndNum();
            int rndNumB = GameOptions.rndNum();

            System.out.println("Question: " + GameOptions.rndNum() );
//            String answer = answerQuestions();
//            System.out.println("Your answer: " + answer);
//
//            if (responseCheck(answer, rndNum)) {
//                System.out.println("Correct!");
//                countCorrect++;
//            } else {
//                String answerInvert = answerInverse(answer);
//                System.out.println("'" + answer
//                        + "' is wrong answer ;(. Correct answer was '"
//                        + answerInvert + "'.");
//                scanner.close();
//                break;
//            }
//        }
//
//        if (countCorrect == VALUE_CORRECT_ANSWER) {
//            System.out.println("Congratulations, " + name + "!");
//        } else {
//            System.out.println("Let's try again, " + name + "!");
//        }
    }
}
