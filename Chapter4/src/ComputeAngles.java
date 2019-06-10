import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args){
        //输入三个点的坐标
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        //计算三条边长
        double a = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2,2));
        double b = Math.sqrt(Math.pow(x1 - x3,2) + Math.pow(y1 - y3,2));
        double c = Math.sqrt(Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2));
        System.out.println("Three sides: " + a + " " + b +" " + c);
        //计算三个角
        double A = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
        A = Math.toDegrees(A);
        double B = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
        B = Math.toDegrees(B);
        double C = Math.acos((c * c - b * b - a * a) / (-2 * b * a));
        C = Math.toDegrees(C);
        System.out.println("Three angles: " + Math.round((A * 100) / 100.0) + " " + Math.round((B * 100) / 100.0) + " " + Math.round((C * 100) / 100.0));
        System.out.println("i + j = " + (1 + 2));//i + j = 3
        System.out.println("i + j = " + 1 + 2);// i + j = 12
    }
}
