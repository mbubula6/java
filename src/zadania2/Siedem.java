package zadania2;

import java.util.Scanner;

public class Siedem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj trzy imiona, a ja posortuję je rosnąco");
        String imie1 = scanner.nextLine();
        String imie2 = scanner.nextLine();
        String imie3 = scanner.nextLine();

        if ( imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) < 0 ) {
            System.out.println("1. " + imie1);
            if(imie2.compareToIgnoreCase(imie3) < 0 ) {
                System.out.println("2. " + imie2);
                System.out.println("3. " + imie3);
            } else {
                System.out.println("2. " + imie3);
                System.out.println("3. " + imie2);
            }
        } else if (imie1.compareToIgnoreCase(imie2) < 0 && imie1.compareToIgnoreCase(imie3) > 0) {
            System.out.println("1. " + imie3 + "\n2. " + imie1 + "\n3. " + imie2);
        } else if (imie1.compareToIgnoreCase(imie2) > 0 && imie1.compareToIgnoreCase(imie3) < 0){
            System.out.println("1. " + imie2 + "\n2. " + imie1 + "\n3. " + imie3);
        } else {
            if( imie2.compareToIgnoreCase(imie3) > 0 ) {
                System.out.println("1. " + imie3 + "\n2. " + imie2 + "\n3. " + imie1 );
            } else {
                System.out.println("1. " + imie2 + "\n2. " + imie3 + "\n3. " + imie1 );
            }
        }


    }
}
