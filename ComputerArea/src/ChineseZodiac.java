import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        switch (year % 12){
            case 0: System.out.println(year + " is monkey year!"); break;
            case 1: System.out.println(year + " is rooster year!"); break;
            case 2: System.out.println(year + " is dog year!"); break;
            case 3: System.out.println(year + " is pig year!"); break;
            case 4: System.out.println(year + " is rat year!"); break;
            case 5: System.out.println(year + " is ox year!"); break;
            case 6: System.out.println(year + " is tiger year!"); break;
            case 7: System.out.println(year + " is rabbit year!"); break;
            case 8: System.out.println(year + " is dragon year!"); break;
            case 9: System.out.println(year + " is snake year!"); break;
            case 10: System.out.println(year + " is horse year!"); break;
            case 11: System.out.println(year + " is sheep year!");
        }
    }
}
