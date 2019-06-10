import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int length = s.length();
        int i;
        for (i = 0; i < length / 2; i++ ){
            if (s.charAt(i) != s.charAt(length - i -1)){
                System.out.println(s + " is not a palindrome.");
                break;
            }
        }
        if (i ==length / 2)
            System.out.println(s + " is a palindrome.");
    }
}
