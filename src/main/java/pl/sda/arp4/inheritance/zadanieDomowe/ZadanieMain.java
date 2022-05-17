package pl.sda.arp4.inheritance.zadanieDomowe;

import java.util.Scanner;

public class ZadanieMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj text");

        String text = scanner.nextLine();

        char[] tablica = text.toCharArray();
        int liczbaKropek = 0, liczbaPrzecinkow = 0;

      //  for (char c : tablica) {
        for (int i = 0; i < text.length(); i++) {

            char znak = text.charAt(i);
            if (znak == '.') {
                liczbaKropek++;
            } else if (znak == ',') {
                liczbaPrzecinkow++;
            }
        }
        System.out.println("W tekście wystąpiło: " + liczbaKropek + " kropek, " + liczbaPrzecinkow + " przecinków.");
    }
}



    //    }


