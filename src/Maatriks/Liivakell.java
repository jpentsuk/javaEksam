package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud liivakella. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 0 0 0 0 0 0 0 0
 * . 0 0 0 0 0 0 0 .
 * . . 0 0 0 0 0 . .
 * . . . 0 0 0 . . .
 * . . . . 0 . . . .
 * . . . 0 0 0 . . .
 * . . 0 0 0 0 0 . .
 * . 0 0 0 0 0 0 0 .
 * 0 0 0 0 0 0 0 0 0
 *
 */
public class Liivakell {

    public static void main(String[] args) {
        String [][] kell = new String [9][9];

        int k = 0;
        int l = 8;
        int m = 8;
        int n = 0;



        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {

                if(j<k && i<5) // ülemine vasakpoolne haru
                {
                    kell[i][j]=". ";
                }
                else if (j>l && i<5) // ülemine parempoolne haru
                {
                    kell[i][j]=". ";
                }
                else if(i>4 && j<m) // alumine vasakpoolne haru
                {
                    kell[i][j]=". ";
                }
                else if(i>4 && j>n) // alumine parempoolne haru
                {
                    kell[i][j]=". ";
                }


                else
                {
                    kell[i][j]="0 ";
                }


            }
            k++;
            l--;
            m--;
            n++;
        }
        printMaatriks(kell);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(String[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
