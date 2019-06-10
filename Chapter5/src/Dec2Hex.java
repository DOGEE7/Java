import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        String hex = "";
        while (decimal != 0){
           int hexValue = decimal % 16;
//           System.out.println("hexValue: " + hexValue);
           char hexDigit = (hexValue <= 9 && hexValue >= 0)? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');//字符与数字转换
           hex = hexDigit + hex;
//           System.out.println(hexDigit);
           decimal = decimal / 16;
        }
        System.out.print("The hex number is " + hex);
    }
}
