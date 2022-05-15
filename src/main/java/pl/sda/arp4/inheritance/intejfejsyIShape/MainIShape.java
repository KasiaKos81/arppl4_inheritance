package pl.sda.arp4.inheritance.intejfejsyIShape;

import java.util.Scanner;

public class MainIShape {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("give shape: square, circle, rectangle");
        String shapeName = scanner.next();

        IShape shape = null;

        if (shapeName.equalsIgnoreCase("circle")){
            System.out.println("give r");
            double inputr = scanner.nextDouble();
            shape = new Circle((inputr));


        } else if  (shapeName.equalsIgnoreCase("square")) {
            System.out.println("Please provide length of the side:");
            double inputsideLenght = scanner.nextDouble();
            shape = new Square(inputsideLenght);


        } else if (shapeName.equalsIgnoreCase("rectangle")) {
            System.out.println("Please provide length of the side1:");
            double inputside1 = scanner.nextDouble();
            System.out.println("Please provide length of the side2");
            double inputside2 = scanner.nextDouble();

            shape = new Rectangle(inputside1, inputside2);

        } else {
            System.err.println("Provided shape can't be calculated.");
        }
        if(shape != null){
        System.out.println("Area          is : " + shape.calculateArea());
        System.out.println("Circumference is : " + shape.calculateCircumference());
    }
}}






