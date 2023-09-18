package zadania2;

import java.util.Scanner;

public class Szesc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile to sekund?\nPodaj liczbę sekund: ");
        int sekundy = scanner.nextInt();
        scanner.nextLine();

        int minuta = 60;
        int godzina = 3600;
        int dzien = 84400;

        int minuty = sekundy / minuta;
        int godziny = sekundy / godzina;
        int dni = sekundy / dzien;

        if ( sekundy > minuta ) {
            System.out.printf("%d sekund to: ", sekundy);
            if ( sekundy > godzina ) {
                if ( sekundy > dzien ) {
                    System.out.printf("%d dni, ", dni);

                }
                System.out.printf("%d godzin, ", godziny);
            }
            System.out.printf("%d minut lub ", minuty);
        }
        System.out.printf("%d sekund.", sekundy);

    }
}
