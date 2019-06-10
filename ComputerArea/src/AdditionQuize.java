import java.util.Scanner;

public class AdditionQuize {
    public static void main(String[] args){
        //产生随机数
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() * 7 % 10);
        Scanner input = new Scanner(System.in);
        System.out.print(number1 + " + " + number2 + " = ");
        //输入答案
        int answer = input.nextInt();
        System.out.print(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
