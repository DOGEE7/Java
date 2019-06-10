import java.util.Scanner;

public class ComputerArea {
    public static void main(String[] args){
//        Scanner input = new Scanner(System. in);
//        System.out.print("Enter a number for radius: ");
//        double radius = input.nextDouble();

//        计算圆的面积
        double radius = 20;
        double area;
        area=radius * radius *3.1415926;
        System.out.println( "The area for the circle of radius " + radius + " is " + area );
//        2的4次方
        System.out.println(Math.pow(2, 4));
//        增强数字的可读性
        long ssn = 233_45_85;
        System.out.println(ssn);
//        华氏度转换成摄氏度
        double celsius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree for Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println(celsius);
    }
}
