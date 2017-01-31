package Maatriks;

import java.util.Arrays;

/**
 * Loo 10*10 maatriks tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad alt vasakult ja jõuavad üles vasakule.
 *
 * Näide 5*5 laual:
 * 30 29 28 27 26
 * 21 22 23 24 25
 * 20 19 18 17 16
 * 11 12 13 14 15
 * 10 9  8  7  6
 * 1  2  3  4  5
 */
public class Tsirkus {

    public static void main(String[] args) {
        int [] [] lauamang = new int[10][10];
        int arv = 100;
        int arv2 = 96;
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                if(i%2==0)// kui i on paarisarv
                {
                    lauamang[i][j]=arv;
                    arv--;
                }
                else
                {
                    lauamang[i][j]=arv2;
                    arv2++;
                }

            }
            arv-=5;
            arv2-=15;
        }
        printMaatriks(lauamang);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
