package pl.sda.arp4.inheritance;

public abstract class Czlowiek {

    // abstract -> klasa abstrakcyjna i nie może istniec instancja tej klasy - nie możemy
    // stworzyć takiego obiektu, została zaimplementowana na cele dziedziczenia

    public void przedstawSie(){
        System.out.println("Jestem człowiekiem");

    }
    public abstract boolean czyPelnoletni();


}
