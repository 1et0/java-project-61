package hexlet.code;

public class GameOptions {

    public static final int VALUE_CORRECT_ANSWER = 3;

    public static int rndNum() {
        int rndNum = (int) (Math.random() * 100);
        return rndNum;
    }

}
