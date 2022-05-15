package pl.sda.arp4.inheritance.exceptions;

public class MainKonto {

    public static void main(String[] args) {
        Konto k = new Konto();

       double ilosc = k.podajIloscSrodkow();
        System.out.println("Stan: " + ilosc);

        // zasilenie konta
        k.przelewPrzychodzacy(1050);

        try {
            k.wykonajPrzelew(1000);
            System.out.println("sukces, przelew poszedl");
        } catch (SrodkiNaKoncieException re) {
            System.out.println("bład: " + re.getMessage());
        }

        ilosc = k.podajIloscSrodkow();
        System.out.println("Stan: " + ilosc);
    }




}
