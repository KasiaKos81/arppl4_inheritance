package pl.sda.arp4.inheritance.wyjatkiZadanie;

import java.util.Scanner;

public class Zadanie1 {

    // 1. Napisz program, który prosi użytkownika o dwie liczby(całkowite) a i b, i wyświetla wynik dzielenia a/b. Jeżeli b jest zerowe program powinien wyświetlić odpowiedni komunikat.
    //Wariant 1: Zastosuj instrukcję if
    //Wariant 2: Zastosuj instrukcję try-catch

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbę");
        int liczba1 = scanner.nextInt();
        System.out.println("podaj drugą liczbę");
        int liczba2 = scanner.nextInt();


       // if(liczba2 == 0) {
         //   System.out.println("nie dzieli się przez zero, cholero");
        //} else {
          //  System.out.println("wynik: " + wynik);
        //}
        try{
            double wynik = liczba1/liczba2;
            System.out.println("wynik: " + wynik);
        } catch (ArithmeticException ae){
            System.out.println("nie dzieli się przez zero, cholero");
        }


    }
}
