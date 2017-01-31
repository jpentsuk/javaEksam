package OOP;

/**
 * Created by kasutaja on 31.01.2017.
 */
public class Korter {

    int mahutab;
    int kylalistearv = 0;

    public Korter(int mahutab) {
        this.mahutab = mahutab;
    }

    public void saabus(String inimene) {

        kylalistearv++;
        mahutab--;

        if (kylalistearv > 10 || mahutab > 10) {
            System.out.println("Rohkem korterisse ei mahu");
            kylalistearv--;
            mahutab++;
        }

    }
    public void prindiKylalisteArv()
    {
        System.out.println(kylalistearv);
    }

    public void prindiPaljuVeelMahub()
    {
        System.out.println(10-kylalistearv);
    }

    public void lahkus(String inimene)
    {
        kylalistearv--;
        mahutab++;
    }
}