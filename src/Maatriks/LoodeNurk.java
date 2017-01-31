package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 suurune maatriks, millele tekib loode suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 1 1 1 1 1 1 1 1 1
 * 1 2 2 2 2 2 2 2 2
 * 1 2 3 3 3 3 3 3 3
 * 1 2 3 4 4 4 4 4 4
 * 1 2 3 4 5 5 5 5 5
 * 1 2 3 4 5 6 6 6 6
 * 1 2 3 4 5 6 7 7 7
 * 1 2 3 4 5 6 7 8 8
 * 1 2 3 4 5 6 7 8 9
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
public class LoodeNurk {

    public static void main(String[] args) {
        int [] [] maatriks = new int [9] [9];
        int a = 1;
        int abiline=1;
        int c = 1;
        int d = 1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9 ; j++) {

                if(a>abiline)
                {
                    maatriks[i][j]=c;
                    System.out.println("kordamine");

                }
                else
                {
                    System.out.println("suurendamine");
                    maatriks[i][j]=d;
                    d++;

                }
                a++;

            }
            a=1;
            d=1;
            abiline++;
            c++;

        }
        printMaatriks(maatriks);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }

}
