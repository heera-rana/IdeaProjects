public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        // you can use the variable names instead of the argument and it is still valid (eg: can also write gameOver: true).
        System.out.println("The High Score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 100;

        System.out.println("The next high score is " +
                calculateScore(gameOver, score, levelCompleted, bonus));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }
    /* public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {}
 method has been defined with a boolean and 3 parameters
 calculateScore(true, 800, 5, 200) {}
 parameters = what is defined ; arguments = values that are sent
 */
}
