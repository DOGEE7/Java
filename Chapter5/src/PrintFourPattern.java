public class PrintFourPattern {
    public static void main(String [] args){
        //First Pattern
        System.out.println("First Pattern");
        for (int i = 1; i <= 6; i++ ){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Second Pattern
        System.out.println("\n" + "Second Pattern " );
        for (int i = 6; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //Third Pattern
        System.out.println("\n" + "Third Pattern " );
        for (int i = 1; i <= 6; i++){
            for (int j = 6; j >= 1; j--){
                if (i >= j)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        //Fourth Pattern
        System.out.println("\n" + "Fourth Pattern " );
        for (int i = 6; i >= 1; i--){
            for (int k = 6 - i; k >=1; k--){
                System.out.print("  ");
            }
            for (int j = 1; j <= 6; j++){
                if (i >= j)
                    System.out.print(j + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
