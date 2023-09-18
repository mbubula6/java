package zadania1;

import java.util.Scanner;

public class Dziesiec {
    public static void main( String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imię: ");
        String firstName = scanner.nextLine();

        System.out.println("Podaj swoje drugie imię: ");
        String middleName = scanner.nextLine();

        System.out.println("Podaj swoje nazwisko: ");
        String lastName = scanner.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println("Pierwsza litera twojego imienia to: " + firstInitial +
                ",drugiego imienia to: " + middleInitial + ", a nazwiska to: " + lastInitial + ".");




    }
}
