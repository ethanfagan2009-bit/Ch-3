import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {   
        Scanner in= new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        int guess= in.nextInt();
        System.out.println("your guess is: "+guess);
        System.out.println("The number I was thinking of was: " + number);
        int close = number-guess;
        System.out.println("You were off by: " + Math.abs(close));
    }
}
