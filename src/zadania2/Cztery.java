package zadania2;

import java.util.Scanner;

public class Cztery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jaką będziesz mieć ocenę z testów\nPodaj swój wynik z pierwszego testu: ");
        double test1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj wynik z drugiego testu: ");
        double test2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj wynik z trzeciego testu: ");
        double test3 = scanner.nextDouble();
        scanner.nextLine();
        int liczbaTestow = 3;

        double srednia = ( test1 + test2 + test3 ) / liczbaTestow;
        int granicaPiec = 90;
        int granicaCztery = 80;
        int granicaTrzy = 70;
        int granicaDwa = 60;

        System.out.printf("Twoja średnia to %.2f \n", srednia);

        if ( srednia >= granicaPiec ) {
            System.out.println("Gratulacje! Dosatjesz 5!");
        } else if (srednia >= granicaCztery ) {
            System.out.println("No i super! Masz 4!");
        } else if ( srednia >= granicaTrzy ) {
            System.out.printf("Git, masz 3");
        } else if ( srednia >= granicaDwa ) {
            System.out.println("Ziom, trzymasz się, masz 2!");
        } else {
            System.out.println("No, masz 1, bywa ¯\\_(ツ)_/¯ ");
        }


    }
}
