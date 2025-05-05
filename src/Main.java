import flyweight.models.Caracter;
import flyweight.models.ETipFont;
import flyweight.models.StilCaracter;
import flyweight.models.StilCaracterFactory;

public class Main {
    //Au fost create 3 caractere, două dintre ele având același stil
    //Stilul celui de al doilea caracter nu a fost creat din nou
    public static void main(String[] args) {
        StilCaracter stil1 = StilCaracterFactory.getStil("Arial", 12, ETipFont.BOLD, "negru");
        stil1.afiseaza(new Caracter('A', 0));

        StilCaracter stil2 = StilCaracterFactory.getStil("Arial", 12, ETipFont.BOLD, "negru");
        stil2.afiseaza(new Caracter('B', 1));

        StilCaracter stil3 = StilCaracterFactory.getStil("Times New Roman", 14, ETipFont.ITALIC, "rosu");
        stil3.afiseaza(new Caracter('C', 2));

        System.out.println("\nTotal stiluri create (unice): " + StilCaracterFactory.getNrStiluriCreate());
        System.out.println("Total cereri stiluri (inclusiv duplicate): " + StilCaracterFactory.getNrStiluriCerute());
    }
}