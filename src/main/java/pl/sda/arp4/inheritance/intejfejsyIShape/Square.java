package pl.sda.arp4.inheritance.intejfejsyIShape;

public class Square implements IShape {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea(){
        return sideLength*2;
    }
    public double calculateCircumference(){
        return sideLength*4;
    }
}
