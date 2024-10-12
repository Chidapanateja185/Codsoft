import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(99) + 1;
        System.out.println("It is a random Number Guess Game, You had a 10 points");
        System.out.println("For wrong attempt 1 point will be deducted");
        helper(number, 10);
    }

    public static void helper(int randomnum, int points) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (randomnum == num) {
                System.out.println("You the game and you had earned " + points + " points");
                System.out.println(grade(points));
                break;
            } else if (num < randomnum) {
                points--;
                System.out.println("Entered number is lessthan the random number");
            } else if (num > randomnum) {
                points--;
                System.out.println("Entered number is greater then random number");
            }
        }
    }

    public static String grade(int n) {
        if (n == 0)
            return "very poor";
        else if (n > 0 && n <= 2)
            return "Poor";
        else if (n > 2 && n <= 5)
            return "Good";
        else if (n > 5 && n <= 8)
            return "Very good";
        else
            return "Great";
    }
}