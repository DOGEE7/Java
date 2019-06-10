import java.util.Scanner;

public class SubtractionQuize {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int temp;
        if (number1 < number2){
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.print(number1 + " - " + number2 + " = ");
        int answer = input.nextInt();
        if (number1 - number2 == answer){
            System.out.print("The answer is correct!");
        }
        else {
            System.out.println("The answer is incorrect!");
            System.out.print(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}
