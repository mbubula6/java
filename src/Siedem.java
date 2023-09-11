public class Siedem {
    static public void main( String [] args ) {
        double sprzedazRegionMazowieckiProcent = 0.62;
        double calkowitaSprzedaz = 4600000;
        double sprzedazRegionMazowiecki = calkowitaSprzedaz * sprzedazRegionMazowieckiProcent;
        System.out.println( "Sprzedaż całkowita firmy to: " + calkowitaSprzedaz +
                ", a samego regionu mazowieckiego to: " + sprzedazRegionMazowiecki);
    }
}
