import java.util.Scanner;

public class Lottery {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick(two digits): ");
        int lottery = (int)(Math.random() * 100);
        int guess = input.nextInt();
        int lotteryDigit1 = lottery % 10;
        int lotteryDigit2 = lottery / 10;
        int guessDigit1 = guess % 10;
        int guessDigit2 = guess / 10;
        if (lottery == guess) {
            System.out.println("The lottery is " + lottery);
            System.out.println("Exact match: you win $10000.");
        }
        else if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2){
            System.out.println("The lottery is " + lottery);
            System.out.println("Match all digits: you win $3000.");
        }
        else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2){
            System.out.println("The lottery is " + lottery);
            System.out.println("Match one digits: you win $1000.");
        }
        else{
            System.out.println("The lottery is " + lottery);
            System.out.println("Sorry: no match." );
        }
    }
}
