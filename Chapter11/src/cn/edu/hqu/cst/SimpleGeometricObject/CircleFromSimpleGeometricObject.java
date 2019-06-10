package cn.edu.hqu.cst.SimpleGeometricObject;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double radius;
    public CircleFromSimpleGeometricObject(){
    }
    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }
    public CircleFromSimpleGeometricObject(double radius,String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
        /**
         * 以上两句等同于super(color,filled)前提，必须放在构造函数里面的第一句）
         */
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public  double Perimeter(){
        return  radius * 2 * Math.PI;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public void printCircle(){
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

}
