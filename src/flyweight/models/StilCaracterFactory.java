package flyweight.models;

import flyweight.enums.ETipFont;

import java.util.HashMap;
import java.util.Map;

public class StilCaracterFactory {
    private static Map<String, StilCaracter> stiluri=new HashMap<>();
    private static int nrStiluri=0;

    public static StilCaracter getStil(String font, int size, ETipFont stilFont, String culoare){
        nrStiluri++;
        String cheie=font+"_"+size+"_"+stilFont+"_"+culoare;

        if(!stiluri.containsKey(cheie)){
            StilCaracter stil=new StilCaracter(font, size, stilFont, culoare);
            stiluri.put(cheie,stil);
        }

        return stiluri.get(cheie);
    }

    public static int getNrStiluriCreate(){
        return stiluri.size();
    }

    public static int getNrStiluriCerute(){
        return nrStiluri;
    }
}
