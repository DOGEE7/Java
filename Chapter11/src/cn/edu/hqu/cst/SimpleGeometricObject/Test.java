package cn.edu.hqu.cst.SimpleGeometricObject;

public class Test {
    public static void main(String[] args){
        CircleFromSimpleGeometricObject circle1 = new CircleFromSimpleGeometricObject(2,"blue",true);
        circle1.printCircle();
        System.out.println("The area is: " + circle1.getArea() + "\nThe perimeter is: " + circle1.Perimeter());
    }
}
