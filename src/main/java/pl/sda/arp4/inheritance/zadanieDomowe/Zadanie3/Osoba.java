package pl.sda.arp4.inheritance.zadanieDomowe.Zadanie3;

public abstract class Osoba {

    protected String imie;
    protected String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public abstract void przedstawSie();


}
