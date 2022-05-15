package pl.sda.arp4.inheritance.interfejsy;

public class Piekarnik implements UrzadzenieWlaczalne, UrzadzenieWylaczalne {

    public void wlacz(){
        System.out.println("włączam piekarnik i żarcie się grzeje");
    }
    public void wylacz(){
        System.out.println("piekarnik stop");
    }

}
