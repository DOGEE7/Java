public class SCircle {
    public static void main(String [] args) {
        SCircle circles = new SCircle();
        System.out.printf("The area is: %-10.2f ", circles.getArea());
        System.out.println();
        System.out.printf("The perimeter is: %-10.2f ", circles.getPerimeter());
        System.out.println();
        circles.setRadius(5);
        System.out.printf("The area is: %-10.2f ", circles.getArea());
        System.out.println();
        System.out.printf("The perimeter is: %-10.2f ", circles.getPerimeter());
        System.out.println();
        SimpleCircle circles1 = new SimpleCircle(8);
        System.out.printf("The area is: %-10.2f ", circles1.getArea());
        System.out.println();
        System.out.printf("The perimeter is: %-10.2f ", circles1.getPerimeter());
    }

    double radius;
    SCircle(){
        radius = 1;
    }
    SCircle(double newradius){
        radius = newradius;
    }
    double getArea(){
        return  (Math.PI *  radius * radius);
    }
    double getPerimeter(){
        return (2 * radius * Math.PI);
    }
    void setRadius(double newradius){
        radius = newradius;
    }

}
