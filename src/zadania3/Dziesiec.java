package zadania3;

import  java.util.Scanner;

public class Dziesiec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podawanie liczb całkowitych. By zakończyć podaj -99");

        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();
        int min = liczba;
        int max = liczba;

        while ( true ) {
            System.out.println("Podaj liczbę:");
            liczba = scanner.nextInt();

            if ( liczba == -99 ) {
                break;
            }

            if ( liczba > max ) {
                max = liczba;
            }
            if ( liczba < min ) {
                min = liczba;
            }
        }

        System.out.println("Największa liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);



    }
}
