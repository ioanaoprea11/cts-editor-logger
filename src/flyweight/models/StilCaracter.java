package flyweight.models;

import flyweight.enums.ETipFont;
import flyweight.interfaces.IStilCaracter;

public class StilCaracter implements IStilCaracter {
    private String font;
    private int size;
    private ETipFont stilFont;
    private String culoare;

    public StilCaracter(String font, int size, ETipFont stilFont, String culoare) {
        this.font = font;
        this.size = size;
        this.stilFont = stilFont;
        this.culoare = culoare;
        System.out.println("S-a creat un nou stil: " + font + ", " + size + "pt, stil=" + stilFont + ", culoare=" + culoare);
    }

    @Override
    public void afiseaza(Caracter caracter) {
        System.out.println("Caracterul '" + caracter.getSimbol() + "' la pozitia " + caracter.getPozitie()
                + " este afisat cu stilul: " + font + ", " + size + "pt, stil=" + stilFont + ", culoare=" + culoare);
    }
}
