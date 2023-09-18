package zadania2;

import java.util.Scanner;

public class Dwanascie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        int powietrze = 343;
        int woda = 1490;
        int stal = 5100;

        double t;

        System.out.println("Wpisz powietrze, woda lub stal");
        String nosnik = scanner.nextLine();

        System.out.println("Podaj odległosć: ");
        double s = scanner.nextDouble();

        switch (nosnik) {
            case "powietrze":
                t = s / powietrze;
                System.out.printf("Potrzeba %.2f sekund, żeby przebyć %.2f", t, s);
                break;
            case "woda":
                t = s / woda;
                System.out.printf("Potrzeba %.2f sekund, żeby przebyć %.2f", t, s);

                break;
            case "stal":
                t = s / stal;
                System.out.printf("Potrzeba %.2f sekund, żeby przebyć %.2f", t, s);

        }



    }
}
