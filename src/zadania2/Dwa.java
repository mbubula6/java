package zadania2;

import java.util.Scanner;

public class Dwa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Czy dana data jest magiczna?\nPodaj miesiąc(liczbowo): ");
        int miesiac = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj dzień miesiąca: ");
        int dzien = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj dwie ostatnie cyfry roku: ");
        int rok = scanner.nextInt();
        scanner.nextLine();

        int pom = miesiac * dzien;

        if ( pom == rok ) {
            System.out.println("Gratuluję! Ta data jest magiczna!");
        } else {
            System.out.println("Niestety :c Ta data nie jest magiczna :(((");
        }

    }
}
