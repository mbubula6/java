package zadania3;

import java.util.Scanner;

public class Dziewiec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prośba o podanie początkowej liczby organizmów i sprawdzenie poprawności danych
        int initialPopulation;
        do {
            System.out.print("Podaj początkową liczbę organizmów (co najmniej 2): ");
            initialPopulation = scanner.nextInt();
        } while (initialPopulation < 2);

        // Prośba o podanie średniego dziennego przyrostu populacji i sprawdzenie poprawności danych
        double dailyGrowthRate;
        do {
            System.out.print("Podaj średni dzienny przyrost populacji (w procentach, nieujemny): ");
            dailyGrowthRate = scanner.nextDouble();
        } while (dailyGrowthRate < 0);

        // Prośba o podanie liczby dni rozmnażania i sprawdzenie poprawności danych
        int days;
        do {
            System.out.print("Podaj liczbę dni rozmnażania (co najmniej 1): ");
            days = scanner.nextInt();
        } while (days < 1);

        // Wyświetlanie prognozowanej wielkości populacji każdego dnia
        System.out.println("Dzień 1: " + initialPopulation + " organizmów");

        for (int day = 2; day <= days; day++) {
            initialPopulation += (int) (initialPopulation * (dailyGrowthRate / 100));
            System.out.println("Dzień " + day + ": " + initialPopulation + " organizmów");
        }

        scanner.close();
    }
}