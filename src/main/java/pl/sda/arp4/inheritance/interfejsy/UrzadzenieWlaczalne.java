package pl.sda.arp4.inheritance.interfejsy;

public interface UrzadzenieWlaczalne {
    public static final int NAPIECIE_ZASIANIA_V = 5;

    // interfejs to typ który posiada tylko metody "public abstract"
    // BEZ IMPLEMENTACJI
    // interfejs jest z definicji absrtakcyjny (nie możemy stworzyć jego instancji)
    // interfejs posiada metody ale nie może posiadać pól
    // zdefiniowane w klasie pola są stałymi
    // interfejs używamy w 2 przypadkach: do defioniowania stałych; do definiowania współnego zachowania
    // klasy abstrakcyjne piszemy kiedy mamy wspolne cechy/pola do dziedziczenia
    // interfejsy piszemy kiedy mamy wspólne zachowania
    // Możemy dziedziczyć po jednej klasie a implementować wiele interfejsów

    public abstract void wlacz();
}
