import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args){
        Scanner inputDistance = new Scanner(System.in);
        Scanner inputMiles = new Scanner(System.in);
        Scanner inputPrice = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = inputDistance.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles = inputMiles.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price = inputPrice.nextDouble();
        double costOfDriving = distance / miles * price;
        System.out.print(costOfDriving);

    }
}
