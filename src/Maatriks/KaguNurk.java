package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 suurune maatriks, millele tekib kagu suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 9 8 7 6 5 4 3 2 1
 * 8 8 7 6 5 4 3 2 1
 * 7 7 7 6 5 4 3 2 1
 * 6 6 6 6 5 4 3 2 1
 * 5 5 5 5 5 4 3 2 1
 * 4 4 4 4 4 4 3 2 1
 * 3 3 3 3 3 3 3 2 1
 * 2 2 2 2 2 2 2 2 1
 * 1 1 1 1 1 1 1 1 1
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.

 */

public class KaguNurk {

    public static void main(String[] args) {
        int [] [] maatriks = new int [9] [9];
        int a = 9;
        int b = 9;

        int abiline=8;

        int c = 9;
        int d = 8;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9 ; j++) {

                if(a>abiline)
                {
                    maatriks[i][j]=c;
                    System.out.println("kordamine");

                }
                else
                {
                    System.out.println("vähendamine");
                    maatriks[i][j]=d;
                    d--;

                }
                a--;

            }
            a=b-1;
            d=b-2;
            b--;
            abiline-=2;
            c--;

        }
        printMaatriks(maatriks);
    }

    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }



}
