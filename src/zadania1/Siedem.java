package zadania1;

public class Siedem {
    public static void main( String [] args ) {
        double sprzedazRegionMazowieckiProcent = 0.62;
        double calkowitaSprzedaz = 4600000;
        double sprzedazRegionMazowiecki = calkowitaSprzedaz * sprzedazRegionMazowieckiProcent;
        System.out.println( "Sprzedaż całkowita firmy to: " + calkowitaSprzedaz +
                ", a samego regionu mazowieckiego to: " + sprzedazRegionMazowiecki);
    }
}
