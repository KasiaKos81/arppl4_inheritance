package pl.sda.arp4.inheritance.intejfejsyIShape;

public class Rectangle implements IShape{

    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double calculateArea(){
        return side1*side2;
    }
    public double calculateCircumference(){
        return (2*side1)+(2*side2);
    }
}
