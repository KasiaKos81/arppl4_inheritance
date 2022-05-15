package pl.sda.arp4.inheritance.exceptions;

public class SrodkiNaKoncieException extends Exception{

    public SrodkiNaKoncieException(String message) {
        // new exception message
        // super -> odwołanie do klasy nadrzednej
        super(message);
    }
}
