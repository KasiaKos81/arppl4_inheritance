package pl.sda.arp4.inheritance;

public class Main {

    public static void main(String[] args) {

        // obiekt o nazwie 'syn' typu 'Syn' może przyjąć
        // wiele form czyli może być przypisany/traktowany jako
        // typ który dziedziczy

        // polimorfizm - obiekt może być traktowany/przypisany
        // jako obiekt swojego typu nadrzędnego

        Czlowiek syn = new Syn();
        syn.przedstawSie();
    }
}
