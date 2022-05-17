package pl.sda.arp4.inheritance.zadanieDomowe.Zadanie3;

public enum Ranga {

    POLKOWNIK("polkownik"),
    MAJOR("major"),
    KAPITAN("kapitan"),
    PORUCZNIK("porucznik"),
    CHORAZY("chorazy"),
    SIERZANT("sierzant"),
    KAPRAL("kapral");

    private final String nazwa;

    Ranga(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
