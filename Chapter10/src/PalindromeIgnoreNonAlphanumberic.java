import java.util.Scanner;

/**
 * 判断回文串时忽略既非字母又非数字的字符
 */

public class PalindromeIgnoreNonAlphanumberic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("Ignoring nonalphanumberic characters, \n is " + s + " a palindrome? " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        String s1 = filter(s);

        String s2 = reverse(s1);
        return s2.equals(s1);
    }
    public static String filter(String s){
        StringBuilder stringBulider = new StringBuilder();
        for (int i = 0;i < s.length();i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                stringBulider.append(s.charAt(i));
            }
        }
        return stringBulider.toString();
    }
    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return  stringBuilder.toString();
    }
}
