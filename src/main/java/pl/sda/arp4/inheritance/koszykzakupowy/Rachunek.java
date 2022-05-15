package pl.sda.arp4.inheritance.koszykzakupowy;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Rachunek {

    private LocalDateTime czasZakupu;
    private Produkt[] produkty;
    private double sumaBrutto;

    public Rachunek(Produkt[] produkty) {
        this.produkty = produkty;
        this.czasZakupu = LocalDateTime.now();

        for (int i = 0; i < produkty.length; i++) {
            sumaBrutto = sumaBrutto + produkty[i].cenaBrutto();
        }
    }

    @Override
    public String toString() {
        return "Rachunek\n" +
                "Data: "+ czasZakupu + "\n" +
                "Produkty: " + Arrays.toString(produkty) + "n\" +" +
                "________________________________________________" +
                "Suma cena brutto: " + sumaBrutto;
    }
}
