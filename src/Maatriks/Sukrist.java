package Maatriks;

import java.util.Arrays;

/**
 * Loo 10*10 maatriks tagurpidi Tsirkuse lauamänguga. Ehk numbrid ühest sajani
 * alustavad ülevalt paremalt ja jõuavad alla paremale (või kui kaugele iganes).
 *
 * Näide 5*5 laual:
 *  5  4  3  2  1
 *  6  7  8  9 10
 * 15 14 13 12 11
 * 16 17 18 19 20
 * 25 24 23 22 21
 * 26 27 28 29 30
 */
public class Sukrist {

    public static void main(String[] args) {
        int [] [] suk = new int [10] [10];
        int a = 10;
        int b = 6;
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <10 ; j++) {
                if(i%2==0) // kui i on paarisarv
                {
                    suk[i][j] = a;
                    a--;
                }
                else
                {
                    suk[i][j] = b;
                    b++;
                }

            }
            a+=15;
            b+=5;

        }

        printMaatriks(suk);
    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
}
