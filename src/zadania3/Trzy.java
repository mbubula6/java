package zadania3;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class Trzy {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("trzy.txt");

        System.out.println("Podaj szybkość pojazdu(w kilometrach na godzinę)");
        double v = scanner.nextDouble();
        System.out.println("Podaj czas podróży(liczbę pełnych godzin)");
        int t = scanner.nextInt();
        double s = 0;

        pw.println("Godzina Przebyta odległość");
        pw.println("--------------------------");

        for ( int i = 0; i < t; i++ ) {
            s += v;
            pw.println("1 " + s);
        }

        pw.close();
    }
}