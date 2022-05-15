package pl.sda.arp4.inheritance.koszykzakupowy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // stworzymy scanner

        Scanner scanner = new Scanner(System.in);

        // poprosimy użytkownika o ilość produktów które będą elementów

        System.out.println("podaj ilość produktów: N");
        int iloscProduktow = scanner.nextInt();

        // stworzymy tablicę o tym rozmiarze
        Produkt[] tablicaProduktow = new Produkt[iloscProduktow];

        // stworzymy pętlę, która ma wykonać się N razy
        for (int i = 0; i < iloscProduktow; i++) {
            // zapytamy N razy o nazwę, cene netto oraz rodzaj podatku
            System.out.println("podaj nazwe produktu:");
            String nazwa = scanner.next();
            System.out.println("podaj cene netto:");
            double cenaNetto = scanner.nextDouble();

            PodatekProduktu podatekProduktu = null;
            do {
                System.out.println("podaj rodzaj podatku " + (Arrays.toString(PodatekProduktu.values())) + ":");
                String podatekProduktuString = scanner.next();
                try {
                    // linia nizej sprawdza czy wpisana tresc zmiennej "podatekProduktuString" pasuje
                    // do jakiejkolwiek z opcji z enum PodatekProduktu, jesli nie to rzuca wyjatek
                    podatekProduktu = PodatekProduktu.valueOf(podatekProduktuString.toUpperCase());
                } catch (IllegalArgumentException iae){
                    System.out.println("zły podatek produktu");
                }
                // dopóki użytkownik nie wpisał poprawnego podatku produktu to powtarzaj pętlę
            } while (podatekProduktu == null);
            // stworzony produkt dodamy

            Produkt produkt = new Produkt(nazwa, cenaNetto, podatekProduktu);
            tablicaProduktow[i] = produkt;

        }
        Rachunek rachunek = new Rachunek(tablicaProduktow);

        System.out.println(rachunek);
    }}
