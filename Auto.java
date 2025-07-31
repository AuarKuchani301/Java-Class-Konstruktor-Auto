package Berechnung;

public class Auto {

    private String hersteller;
    private int modell;

    // 1.automatische Konstruktor.
   public Auto()
    {
        hersteller = "SHADI";
        modell = 1995;
    }
    //2. Konstruktor mit User Werte.
    public Auto(String s, int m)
    {
       hersteller = s;
       modell = m;
    }

    // 3. ohne Konstruktor.
    public void setHersteller(String wem)
    {
        if(wem == "BNW" || wem=="Toyota"|| wem == "Honda"||wem == "Merceds")
            hersteller = wem;
        else
            System.out.println("Fehler!! Sie haben falsche eingabe.");
    }
    public void setModell(int jahr)
    {
        if(jahr > 0)
            modell = jahr;
        else
            System.out.println("Fehler!! Sie haben falsche Modell eingegeben.");
    }
    public String getHersteller()
    {
        return hersteller;
    }
    public int getModell()
    {
        return modell;
    }
}
