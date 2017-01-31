package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud kikilipsu. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 . . . . . . . 0
 * 0 0 . . . . . 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 . . . . . 0 0
 * 0 . . . . . . . 0
 *
 */
public class Kikilips {

    public static void main(String[] args) {
        String [][] kikilips = new String [9][9];

        int k = 1;
        int l = 7;
        int m = 9;
        int n = -1;



        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j <9 ; j++) {

                if(j<k && i<5) // ülemine vasakpoolne haru
                {
                    kikilips[i][j]="0 ";
                }
                else if (j>l && i<5) // ülemine parempoolne haru
                {
                    kikilips[i][j]="0 ";
                }
                else if(i>4 && j<m) // alumine vasakpoolne haru
                {
                    kikilips[i][j]="0 ";
                }
                else if(i>4 && j>n) // alumine parempoolne haru
                {
                    kikilips[i][j]="0 ";
                }


                else
                {
                    kikilips[i][j]=". ";
                }


            }
            k++;
            l--;
            m--;
            n++;






        }
        printMaatriks(kikilips);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(String[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
