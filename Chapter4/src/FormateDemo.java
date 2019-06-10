public class FormateDemo {
    public static void main(String [] args){
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount * interestRate;
        System.out.printf("Interest is $%10.2f",interest);
        System.out.println();
        System.out.printf("amount is %10.2f",amount);

        //建立表格
        int degree = 30;
        double radians = Math.toRadians(degree);
        System.out.println();
        System.out.printf("%-10s%-10s%-10s%-10s%-10s","Degrees","Radians","Sine","Consine","Tangent");
        System.out.println();
        System.out.printf("%-10d%-10f%-10f%-10f%-10f",degree,radians,Math.sin(radians),Math.cos(radians),Math.tan(radians));
    }
}
