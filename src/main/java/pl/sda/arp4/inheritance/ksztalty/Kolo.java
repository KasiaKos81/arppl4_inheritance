package pl.sda.arp4.inheritance.ksztalty;

public class Kolo extends Ksztalt{

    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double obliczPole(){
        return Math.PI * Math.pow(promien, 2.0);
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }
}
