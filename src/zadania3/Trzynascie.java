package zadania3;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Trzynascie {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku:");
        String nazwapliku = scanner.nextLine();
        File file = new File(nazwapliku);

        Scanner fs = new Scanner(file);

        for ( int i = 0; i < 5; i++ ) {
            if ( fs.hasNext() ) {
                String line = fs.nextLine();
                System.out.println(line);
            }
        }
        fs.close();
    }
}
