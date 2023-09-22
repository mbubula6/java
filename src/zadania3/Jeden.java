package zadania3;

import java.util.Scanner;

public class Jeden {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę");
        int n = scanner.nextInt();
        int suma = 0;

        for ( int i = 0; i < n; i++ ) {
            suma += i;
        }
        System.out.println("Suma ciągu 0-" + n + " wynosi " + suma);
    }
}
