import java.util.Scanner;

public class InputOUtput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter an integer: ");
        int data = input.nextInt();
        while (data !=0 ){
            sum += data;
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
