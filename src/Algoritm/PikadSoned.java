package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {

    public static void main(String[] args) {


        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        int tahtedearv = 0;
        for (int i = 0; i < naide.length; i++) {
            tahtedearv = tahtedearv + naide[i].length();
        }
        int keskminetahtedearvsonas = tahtedearv / naide.length;

        int counter = 0;
        for (int i = 0; i < naide.length; i++) {
            if (naide[i].length() > keskminetahtedearvsonas) {
                counter++;
            }
        }
        System.out.println("Selliseid sõnu on " + counter);
    }
}
