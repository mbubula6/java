import java.util.Scanner;
public class Dwanascie {
    public static void main( String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj przejechane kilometry: ");
        double przejechaneKilometry = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Podaj zużyte litry: ");
        double litryPaliwa = scanner.nextDouble();

        double kilometryNaLitrze = przejechaneKilometry / litryPaliwa;

        System.out.println("Kilometry na litrze: " + String.format("%.2f", kilometryNaLitrze));

    }
}
