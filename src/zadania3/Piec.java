package zadania3;

import java.util.Scanner;

public class Piec {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków:");
        String string = scanner.nextLine();
        int l = string.length();
        System.out.println("Podaj szukany znak:");
        char znak = scanner.next().charAt(0);
        System.out.println(znak);
        int wystapienia = 0;

        for ( int i = 0; i < l; i++ ) {
            if ( string.charAt(i) == znak ) {
                wystapienia++;
            }
        }
        System.out.println("Znak " + znak + " wystąpił " + wystapienia + " razy");
    }
}
