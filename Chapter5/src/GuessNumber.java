import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        int number = (int)(Math.random() * 100);
        System.out.println("Guess a magic number(0 < number <100).");
        Scanner input = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            if (guess > number)
                System.out.println("Your guess is too high!");
            else if (guess < number)
                System.out.println("Your guess is too low!");
            else {
                System.out.println("Yes! The number is " + number);
                break;
            }
        }while (number != guess);

    }
}
