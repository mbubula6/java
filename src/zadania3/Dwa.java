package zadania3;

import java.util.Scanner;

public class Dwa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj szybkość pojazdu(w kilometrach na godzinę)");
        double v = scanner.nextDouble();
        System.out.println("Podaj czas podróży(liczbę pełnych godzin)");
        int t = scanner.nextInt();
        double s = 0;

        System.out.println("Godzina Przebyta odległość");
        System.out.println("--------------------------");

        for ( int i = 0; i < t; i++ ) {
            s += v;
            System.out.println("1 " + s);
        }
    }
}