package zadania2;

import java.util.Scanner;

public class Piec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sprawdźmy, czy obiekt się nadaje\nPodaj jego masę");
        double m = scanner.nextDouble();
        scanner.nextLine();

        double g = 9.8;
        double q = m * g;
        int ciezki = 1000;
        int lekki = 10;

        if ( q > ciezki ) {
            System.out.println("Obiekt jest za ciężki :c");
        } else if (q < lekki) {
            System.out.println("Obiekt jest za lekki :c");
        } else {
            System.out.println("Git, obiekt się nadaje!");
        }

    }
}
