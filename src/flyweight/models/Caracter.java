package flyweight.models;

public class Caracter {
    private char simbol;
    private int pozitie;

    public Caracter(char simbol, int pozitie) {
        this.simbol = simbol;
        this.pozitie = pozitie;
    }

    public char getSimbol() {
        return simbol;
    }

    public int getPozitie() {
        return pozitie;
    }
}
