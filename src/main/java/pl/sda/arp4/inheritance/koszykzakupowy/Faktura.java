package pl.sda.arp4.inheritance.koszykzakupowy;

public class Faktura extends Rachunek{
    private String nip;

    public Faktura(String nip, Produkt[] produkty) {
        super(produkty);
        this.nip = nip;
    }
}
