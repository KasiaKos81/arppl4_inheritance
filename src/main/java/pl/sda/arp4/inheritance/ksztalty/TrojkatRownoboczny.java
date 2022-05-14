package pl.sda.arp4.inheritance.ksztalty;

public class TrojkatRownoboczny extends Ksztalt{

    // pole trójkata = 1/2 * a * h

    private double dlugosciBoku;
    private double wysokosc;

    public TrojkatRownoboczny(double dlugosciBoku, double wysokosc) {
        this.dlugosciBoku = dlugosciBoku;
        this.wysokosc = wysokosc;
    }

    @Override
    public double obliczPole() {
        return 0.5*dlugosciBoku*wysokosc;
    }


    @Override
    public double obliczObwod() {
        return 3*dlugosciBoku;
    }
}
