package zadania3;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Szesc {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku:");
        String nazwapliku = scanner.nextLine();
        File file = new File(nazwapliku);

        System.out.println("Podaj szukany znak:");
        char znak = scanner.next().charAt(0);
        int wystapienia = 0;

        Scanner fs = new Scanner(file);

        while ( fs.hasNext() ) {
            String string = fs.nextLine();
            int l = string.length();
            for ( int i = 0; i < l; i++ ) {
                if ( string.charAt(i) == znak ) {
                    wystapienia++;
                }
            }
        }
        System.out.println("Znak '" + znak + "' wystąpił " + wystapienia + " razy");
        fs.close();
    }
}
