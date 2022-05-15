package pl.sda.arp4.inheritance.wyjatkiZadanie;

import java.util.Scanner;

public class MainCholeroException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbę");
        int liczba1 = scanner.nextInt();
        System.out.println("podaj drugą liczbę");
        int liczba2 = scanner.nextInt();
        int wynik = liczba1 / liczba2;


        if (liczba2 == 0) {
            System.out.println("nie dzieli się przez zero, cholero");
        } else {
            System.out.println("wynik: " + wynik);
        }
    }}