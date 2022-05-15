package pl.sda.arp4.inheritance.exceptions;

public class Konto {

    private double iloscSrodkow;

    public double podajIloscSrodkow(){
        return iloscSrodkow;
    }
    public void wykonajPrzelew(double kwota1) throws SrodkiNaKoncieException {
        if(iloscSrodkow < kwota1){
            throw new SrodkiNaKoncieException("bład przelewu, brak srodków!");
        }
        iloscSrodkow = iloscSrodkow - kwota1;
    }
    public void przelewPrzychodzacy(double kwota2){
        iloscSrodkow = iloscSrodkow + kwota2;
    }



}
