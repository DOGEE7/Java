public class VarArgsDemo {
    public static void main(String[] args){
        System.out.println("可变长参数列表");
        printMax(1,6,96,55,8);
        printMax(new double[]{1.22,5888,477.2,44,2.06});
    }
    public static void  printMax(double...numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers [0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>result)
                result = numbers[i];
        }
        System.out.println("The max number is " + result);
    }
}
