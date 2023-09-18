package zadania1;

import java.util.Scanner;

public class DwadziesciaJeden {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Oblicz stan konta po latach\nPodaj kwotę początkowo zdeponowaną na koncie: ");
        double P = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj roczną stopę oprocentowania: ");
        double r = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ile razy w roku odsetki są kapitalizowane?: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Przez ile lat dsetki będą znajdować się na koncie?: ");
        int t = scanner.nextInt();
        scanner.nextLine();

        double A = P * ( 1 + r / ( n ^ ( n * t)));

        System.out.printf("Po tylu latach na konciesz będzie: %.2f", A);
    }
}
