import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long startTime = System.currentTimeMillis();//长整型
        int a,b,answer,num = 0;
        int correctNumber = 0;
        do {
            a = (int)(Math.random() * 10);
            b = (int)(Math.random() * 10);
            if (a >= b){
                num ++;
                System.out.print( a + " - " + b + " = ");
                answer = input.nextInt();
                if (a - b == answer){
                    System.out.println("You are correct! ");
                    correctNumber ++;
                }
                else{
                    System.out.println("Your answer is wrong.");
                    System.out.println(a + " - " + b + " should be " + (a - b));
                }
            }
        }while (num != 5);
        long endTime = System.currentTimeMillis();
        System.out.println("Correct count is " + correctNumber);
        System.out.println("Test time is " + (endTime - startTime) / 1000 + " seconds");
    }
}
