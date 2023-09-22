package zadania3;

import java.util.Scanner;

public class Dwanascie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj sprzedaż");
            int sprzedaz = scanner.nextInt();
            System.out.printf("Sklep " + i);

        }
    }
}