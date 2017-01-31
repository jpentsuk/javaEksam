package OOP;

import java.util.ArrayList;

/**
 * Created by kasutaja on 31.01.2017.
 */
public class Sonaraamat {
    String raamatuKeel;
    ArrayList<String> sonad = new ArrayList<String>(); // siia listi lisame kõik sõnad
    ArrayList<String> otsingutulemused = new ArrayList<String>(); // siia lisame kõik otsingutulemused
    String [] vastused;

    public Sonaraamat(String raamatuKeel)
    {
        this.raamatuKeel = raamatuKeel;
    }

    public void sisestaSona(String sona)
    {
        sonad.add(sona);
    }

    public String [] otsiEsimeseTaheJargi(String taht)
    {
        for (String sona :sonad) { // kui Sõnade list sisaldab sõna, mis algab
            if (sona.startsWith(taht)) // vastava tähega
            {
                otsingutulemused.add(sona); // siis lisa see sõna uude arraylisti
            }
        }
        vastused = new String[otsingutulemused.size()]; // loome uue stringide massiivi, mis on täpselt
        // otsingutulemuste arvu pikkusega
        int kordaja = 0;
        for (String vas : otsingutulemused) // kõik sõnad otsingutulemused
        {
            vastused[kordaja] = vas; // lisame loodud massiivi
            kordaja++;
        }
        otsingutulemused.clear(); // tühjendame abiks olnud Arraylisti

        return vastused; // tagastame Stringide massiivi
    }
    public void eemaldaSona(String vastuse)
    {
        vastused[0] = "---";

        for (int i = 0; i <vastused.length ; i++) {
            System.out.println(vastused[i]);
        }
    }





    public void misKeelesRaamatOn()
    {
        System.out.println(raamatuKeel);
    }



}
