package OOP;

import java.util.ArrayList;

/**
 * Created by kasutaja on 31.01.2017.
 */
public class Kassa {
    String kassapidaja;
    ArrayList<String> ostunimekiri = new ArrayList<String>();

    public Kassa(String kassapidaja)
    {
        this.kassapidaja = kassapidaja;
    }

    public void lisaToode(String toode)
    {
        ostunimekiri.add(toode);
    }

    public void eemaldaToode(String toode)
    {
        ostunimekiri.remove(toode);
    }

    public void prindiOstutsekk()
    {
        System.out.println(ostunimekiri);
    }
    public void prindiKassapidajaNimi()
    {
        System.out.println(kassapidaja);
    }
}
