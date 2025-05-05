import decorator.enums.LogLevel;
import decorator.interfaces.ILogger;
import decorator.models.BasicLogger;
import decorator.models.LevelLogger;
import decorator.models.ThreadIdLogger;
import decorator.models.TimestampLogger;
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

        //================ DECORATOR ============
        System.out.println("\n\n\n");

        ILogger basicLogger = new BasicLogger();
        basicLogger.log("Conexiune esuata!");

        ILogger logger1 = new TimestampLogger(
                new LevelLogger(
                        new BasicLogger(),
                        LogLevel.INFO
                )
        );
        logger1.log("Sistemul a pornit cu succes.");

        ILogger logger2 = new TimestampLogger(
                new LevelLogger(
                        new ThreadIdLogger(
                                new BasicLogger()
                        ),
                        LogLevel.ERROR
                )
        );
        logger2.log("Eroare la salvarea datelor.");

//-------------------------------------------------------------------------------

    }
}