import java.util.Scanner;

public class Transform {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        char h = input.next().charAt(0);
//        if (h.length() != 1)
//            System.out.println("Please enter one digit!");
        int o = 0;
        if (h>='A' && h<'G')
            o =(int) (h - 'A' + 10);
        System.out.print(o);


    }
}

