package zadania2;

import java.util.Scanner;

public class Trzy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Obliczmy Twoje BMI\nPodaj swoją wagę: ");
        double waga = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj swój wzrost(w metrach i z przecinkiem): ");
        double wzrost = scanner.nextDouble();
        scanner.nextLine();

        double bmi = waga / wzrost;
        double granicaNiedowagi = 18.5;
        double granicaNadwagi = 25;


        if ( bmi < granicaNiedowagi ) {
            System.out.printf("Twoje BMI wynosi: %.2f Jeju, masz niedowagę :c, jedz więcej", bmi);
        } else if (bmi > granicaNadwagi) {
            System.out.printf("Twoje BMI wynosi: %.2f Masz nadwagę :c, zadbaj o siebie", bmi);
        } else {
            System.out.printf("Twoje BMI wynosi: %.2f Dobrze! Twoja waga jest w normie!", bmi);
        }
    }
}
