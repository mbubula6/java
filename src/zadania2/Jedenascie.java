package zadania2;

import java.util.Scanner;

public class Jedenascie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwisko biegacza 1: ");
        String biegacz1 = scanner.nextLine();
        System.out.println("Podaj jego czas: ");
        double biegacz1czas = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Podaj nazwisko biegacza 2: ");
        String  biegacz2 = scanner.nextLine();
        System.out.println("Podaj jego czas: ");
        double biegacz2czas = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Podaj nazwisko biegacza 3: ");
        String  biegacz3 = scanner.nextLine();
        System.out.println("Podaj jego czas: ");
        double biegacz3czas = scanner.nextDouble();
        scanner.nextLine();

        if ( biegacz1czas < biegacz2czas && biegacz1czas < biegacz3czas) {
            if ( biegacz2czas < biegacz3czas ) {
                System.out.println(biegacz1 + " " + biegacz2 + " " + biegacz3);
            }else {
                System.out.println(biegacz1 + " " + biegacz3 + " " + biegacz2);
            }
        } else if (biegacz1czas < biegacz2czas && biegacz1czas > biegacz3czas) {
            System.out.println(biegacz3 + " " + biegacz1 + " " + biegacz2);
        } else if (biegacz1czas > biegacz2czas && biegacz1czas < biegacz3czas) {
            System.out.println(biegacz2 + " " + biegacz1 + " " + biegacz3);
        } else {
            if( biegacz2czas < biegacz3czas) {
                System.out.println(biegacz2 + " " + biegacz3 + " " + biegacz1);
            } else {
                System.out.println(biegacz3 + " " + biegacz2 + " " + biegacz1);
            }
        }

    }

}
