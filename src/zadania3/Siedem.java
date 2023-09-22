package zadania3;

import java.util.Scanner;

public class Siedem {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Podaj liczbę pięter");
    int pietra = scanner.nextInt();
    double wszystkiePokoje = 0;
    double zajetePokoje = 0;

    for ( int i = 0; i < pietra; i++ ) {
        System.out.println("Podaj liczbę wszystkich pokoi " + (i+1) + " piętrze:");
        double pom = scanner.nextDouble();
        while ( pom < 10 ) {
            System.out.println("Za mała liczba pokoi, wpisz jeszcze raz");
            System.out.println("Podaj liczbę wszystkich pokoi " + (i+1) + " piętrze:");
            pom = scanner.nextDouble();
        }
        wszystkiePokoje += pom;
        System.out.println("Podaj liczbę zajętych pokoi na " + (i+1) + " piętrze:");
        pom = scanner.nextDouble();
        zajetePokoje += pom;

    }
    double oblozenie = zajetePokoje/wszystkiePokoje;
    System.out.printf("W hotelu jest %.0f wszystkich pokoi,\n %.0f zajętych pokoi,\n a pozaiom obłożenia wynosi %.2f",
            wszystkiePokoje, zajetePokoje, oblozenie);


    }
}
