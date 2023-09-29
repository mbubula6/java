package zadanie4;

import java.util.Scanner;

public class Cztery {
    public static void main(String[] args) {

        for ( int i = 0; i < 10; i++ ) {

            System.out.println(fallingDistance(i));

        }
    }
    public static double g = 9.8;
    private static double fallingDistance(double t) {
        double d = 0.5 * g * ( t * t );

        return d;
    }
}
