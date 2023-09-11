public class Piec {
    public static void main( String [] args ) {
        double pokojJedenSzerokosc = 3;
        double pokojJedenDlugosc = 4;

        double pokojDwaSzerokosc = 2;
        double pokojDwaDlugosc = 3;

        double pokojTrzySzerokosc = 2;
        double pokojTrzyDlugosc = 2;

        double pokojJedenWymiary = pokojJedenSzerokosc * pokojJedenDlugosc;
        double pokojDwaWymiary = pokojDwaSzerokosc *  pokojDwaDlugosc;
        double pokojTrzyWymiary = pokojTrzySzerokosc * pokojTrzyDlugosc;

        int liczbaPokoiJeden = 2;
        int liczbaPokoiDwa = 1;
        int liczbaPokoiTrzy = 1;

        double powierzchniaCalkowita = pokojJedenWymiary * liczbaPokoiJeden + pokojDwaWymiary * liczbaPokoiDwa +
                pokojTrzyWymiary * liczbaPokoiTrzy;

        System.out.println("Powierzchnia całkowita to: " + powierzchniaCalkowita);

    }
}
