package pl.sda.arp4.inheritance.ksztalty;

public class Main {

    public static void main(String[] args) {

        Kwadrat k = new Kwadrat(5);
        TrojkatRownoboczny trojkat1 = new TrojkatRownoboczny(3.0, 2.6);

        System.out.println("pole kwadratu: " + k.obliczPole());
        System.out.println("obwod kwadratu: " + k.obliczObwod());
        System.out.println("pole trójkata wynosi: " + trojkat1.obliczPole());
        System.out.println("obwod trójkąta wynosi: " + trojkat1.obliczObwod());

    }

}
