package pl.sda.arp4.inheritance.ptaki;

public class MainPtaki {

    public static void main(String[] args) {

        Ptak sowa = new Sowa();
        sowa.spiewaj();

        Ptak ptak1 = new Ptak();
        ptak1.spiewaj();
    }
}
