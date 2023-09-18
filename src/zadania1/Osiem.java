package zadania1;

import java.util.Scanner;

public class Osiem {
    public static void main( String [] args ) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wymiary pierwszego pokoju: \n Szerokość: ");
        int pokojJedenSzerokosc = scanner.nextInt();
        System.out.println("Długość: ");
        int pokojJedenDlugosc = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj wymiary drugiego pokoju: \n Szerokość: ");
        int pokojDwaSzerokosc = scanner.nextInt();
        System.out.println("Długość: ");
        int pokojDwaDlugosc = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Podaj wymiary trzeciego pokoju: \n Szerokość: ");
        int pokojTrzySzerokosc = scanner.nextInt();
        System.out.println("Długość: ");
        int pokojTrzyDlugosc = scanner.nextInt();
        scanner.nextLine();

        int pokojJedenWymiary = pokojJedenSzerokosc * pokojJedenDlugosc;
        int pokojDwaWymiary = pokojDwaSzerokosc *  pokojDwaDlugosc;
        int pokojTrzyWymiary = pokojTrzySzerokosc * pokojTrzyDlugosc;

        int liczbaPokoiJeden = 2;
        int liczbaPokoiDwa = 1;
        int liczbaPokoiTrzy = 1;

        int powierzchniaCalkowita = pokojJedenWymiary * liczbaPokoiJeden + pokojDwaWymiary * liczbaPokoiDwa +
                pokojTrzyWymiary * liczbaPokoiTrzy;
        int liczbaOsob = 4;

        int powierzchniaNaOsobe = powierzchniaCalkowita / liczbaOsob;

        System.out.println("Powierzchnia całkowita to: " + powierzchniaCalkowita +
                "\nPowierzchnia na osobę to: " + powierzchniaNaOsobe );

    }
}
