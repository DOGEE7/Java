import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args){
        int [][]m = getArray();
        System.out.println("The sum is " + sum(m));
    }
    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row of array: ");
        int row = input.nextInt();
        System.out.print("Enter the column of array: ");
        int column = input.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Enter the array");
        for (int i = 0;i <row;i++){
            for (int j = 0;j < column;j++){
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    public static int sum(int[][] array){
        int sum = 0;
        for (int i = 0;i<array.length;i++){
            for (int j = 0;j<array[i].length;j++){
                sum += array[i][j];
            }
        }
        return sum;
    }
}
