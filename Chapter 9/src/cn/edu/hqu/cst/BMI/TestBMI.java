package cn.edu.hqu.cst.BMI;

public class TestBMI {
    public static void main(String[] args){
        BMI bmi1 = new BMI("JinYani",19,47,1.57);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
        BMI bmi2 = new BMI("JinYifan",60,1.65);
        System.out.print("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
