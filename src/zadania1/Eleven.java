package zadania1;

import  java.util.Scanner;

public class Eleven {
    public static void main( String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert value of the product: (use comma for decimals)");
        double productValue = scanner.nextDouble();

        double stateTax = 0.04;
        double localTax = 0.02;

        double productStateTax = stateTax * productValue;
        double productLocalTax = localTax * productValue;

        double productValueSum = productValue + productLocalTax + productStateTax;

        System.out.println("Product value: " +  String.format("%.2f",productValue) + "\nProduct state tax: " +
                String.format("%.2f",productStateTax) + "\nProduct local tax: " +  String.format("%.2f",productLocalTax) +
                "\nProduct price: " + String.format("%.2f",productValueSum));

    }
}
