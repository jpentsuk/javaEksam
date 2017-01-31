package OOP;

/**
 * Created by kasutaja on 31.01.2017.
 */
public class Pastakas {

    int tindiKogus;

    public Pastakas(int tindiKogus)
    {
        this.tindiKogus = tindiKogus;
    }

    public void kirjuta(String lause)
    {
        System.out.println(lause);
        tindiKogus-=lause.length();
    }

    public void prindiPaljuTintiAlles()
    {
        System.out.println(tindiKogus);
    }
}
