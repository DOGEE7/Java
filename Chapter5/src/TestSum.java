public class TestSum {
    public static void main(String[] args){
        double sum = 0;
        for (double i = 0.01f; i <= 1.0f; i = i + 0.01f)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}
