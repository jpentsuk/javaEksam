package OOP;

import java.util.ArrayList;

/**
 * Created by kasutaja on 31.01.2017.
 */
public class Chat {

    ArrayList sonumid = new ArrayList();
    String toaNimi; // klassimuutuja

    public Chat(String toaNimi) // teen konstruktori, sest objekti tehes on antud argument kaasa
    {
        this.toaNimi = toaNimi; // omistan konstruktori muutuja klassimuutujaga
    }

    public void sisestaSonum(String nimi, String sonum) {
        sonumid.add(nimi + " , " + sonum);
    }

    public void prindiKoikSonumidKoosKasutajanimega() {
        for (int i = 0; i < sonumid.size(); i++) {
            System.out.println(sonumid.get(i));
        }
        System.out.println();
    }

    public void adminKustutabSonumi(String sonum) {
        for (int i = 0; i < sonumid.size(); i++) {
            if (sonumid.contains(sonum))
            {
                sonumid.remove(i);
            }
        }
    }
    public void prindiToaNimi()
    {
        System.out.println(toaNimi);
    }
}
