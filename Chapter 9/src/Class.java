import javafx.geometry.Point2D;
import javafx.geometry.Point3D;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Class {
    public static void main(String[] args){
        System.out.println("Date Class");
        Date date = new Date();
        System.out.println("The elapsed time since Jan 1,1970 is " + date.getTime() + "milliseconds");
        System.out.println(date.toString());
        date.setTime(195232896);
        System.out.println("The new time is: " + date.toString());

        System.out.println("Random Class");
        Random random1 = new Random(1);
        System.out.print("From random1: ");
        for (int i = 0;i < 10;i++){
            System.out.printf("%-5.2f",random1.nextDouble());
            System.out.print(" ");
        }
        Random random2 = new Random(1);
        System.out.print("\nFrom random2: ");
        for (int i = 0;i < 10;i++){
            System.out.print(-random2.nextLong());
            System.out.print(" ");
        }

        System.out.println("Point2D");
        Point2D p1 = new Point2D(2.5,3.3);
        Point2D p2 = new Point2D(5.6,9.6);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.distance(p2));

        Point3D p3 = new Point3D(2.5,3.6,9.9);
        System.out.println(p3);
    }
}
