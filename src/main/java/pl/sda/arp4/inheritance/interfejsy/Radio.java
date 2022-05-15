package pl.sda.arp4.inheritance.interfejsy;

public class Radio implements UrzadzenieWlaczalne, UrzadzenieWylaczalne {

    public void wlacz(){
        System.out.println("uruchamiam radio. nutki nutki");
    }
    public void wylacz(){
        System.out.println("radio stop");
    }

}
