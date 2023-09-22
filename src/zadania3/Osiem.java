package zadania3;

import java.util.Scanner;

public class Osiem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę lat");
        int lata = scanner.nextInt();
        while ( lata < 1 ) {
            System.out.println("Niepoprawna ilość lat, podaj ponownie");
            System.out.println("Podaj liczbę lat");
            lata = scanner.nextInt();
        }
        int liczbaMiesiecy = 12;
        double[][] miesiace = new double[lata][liczbaMiesiecy];
        double opadyLacznie = 0;
        double[] opadySrednia = new double[liczbaMiesiecy];

        for ( int i = 0; i < lata; i++ ) {
            System.out.println("Rok " + (i+1) );
            if ( i == 0 ) {
                for ( int j = 0; j < liczbaMiesiecy; j++ ) {
                    System.out.println("Podaj, ile centymetrów opadów spadło w " + (j + 1) + " miesiącu");
                    miesiace[i][j] = scanner.nextDouble();
                    while ( miesiace[i][j] < 0 ) {
                        System.out.println("Niepoprawna ilość, podaj ponownie");
                        System.out.println("Podaj, ile centymetrów opadów spadło w " + (j + 1) + " miesiącu");
                        miesiace[i][j] = scanner.nextDouble();
                    }
                    opadyLacznie += miesiace[i][j];
                    opadySrednia[j] = miesiace[i][j];
                }
            } else {
                for ( int j = 0; j < liczbaMiesiecy; j++ ) {
                    System.out.println("Podaj, ile centymetrów opadów spadło w " + (j + 1) + " miesiącu");
                    miesiace[i][j] = scanner.nextDouble();
                    opadyLacznie += miesiace[i][j];
                    opadySrednia[j] += miesiace[i][j];
                }
            }
        }
        int liczbaMiesiecyWOkresie = liczbaMiesiecy * lata;
        System.out.println("Liczba miesięcy w podanym okresie: " + liczbaMiesiecyWOkresie);
        System.out.println("Łącznie spadło " + opadyLacznie + " centymetrów opadów");

        for ( int i = 0; i < liczbaMiesiecy; i++ ) {
            opadySrednia[i] /= lata;
            System.out.println("W " + (i+1) + " miesiącu spadło " + opadySrednia[i] + " centymetrów opadów");
        }
    }
}
