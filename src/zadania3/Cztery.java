package zadania3;

import java.util.Scanner;

public class Cztery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj czas: ");
        int n = scanner.nextInt();
        double suma = 0;

        System.out.println("Dzień Wypłata");

        for ( int i = 0; i < n; i++ ) {
            double dzien = java.lang.Math.pow(2,i) / 100;
            suma += dzien;
            System.out.println( i+1 + " " + dzien);
        }
        System.out.printf("Cała wypłata wynosi %.2f",suma);
    }
}
