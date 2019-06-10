public class FutureTuition {
    public static void main(String[] args){
        double tution = 10000;
        int year=1;
        for (int i=1;tution <=20000; i++){
            tution = tution * (1 + 0.07);
            year = i;
        }
        System.out.printf("Tution will be $%.2f in %1d years", tution, year);
    }
}
