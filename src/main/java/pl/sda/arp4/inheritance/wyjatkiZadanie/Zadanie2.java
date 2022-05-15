package pl.sda.arp4.inheritance.wyjatkiZadanie;

import java.util.Scanner;

public class Zadanie2 {

    //  Napisz program który pyta użytkownika o dwie liczby (wykorzystaj program 1)
    //  a następnie sprawdza czy druga liczba nie jest ==0. Jeśli jest,
    //  to wyrzuca wyjątek ‘CholeroException’ z komunikatem
    //  “Pamiętaj cholero, by nie dzielić przez zero!”.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbę");
        int liczba1 = scanner.nextInt();
        System.out.println("podaj drugą liczbę");
        int liczba2 = scanner.nextInt();


    }

}


