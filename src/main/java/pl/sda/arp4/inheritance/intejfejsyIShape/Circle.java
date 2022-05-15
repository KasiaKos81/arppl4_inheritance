package pl.sda.arp4.inheritance.intejfejsyIShape;

public class Circle implements IShape{

    private double r;

    public Circle(double r) {
        this.r = r;
    }
    public double calculateArea(){
        return Math.PI*r*r;
    }
    public double calculateCircumference(){
        return 2*Math.PI*r;
    }
}
