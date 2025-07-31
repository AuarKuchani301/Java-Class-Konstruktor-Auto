package Berechnung;
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

       /* // 1.automatische Konstruktor
        Auto aKonstruktor = new Auto();
        System.out.println("Die Info übers Auto-Hersteller, die automatisch da sind: "+aKonstruktor.getHersteller());
        System.out.println("Die Info übers Auto-Modell, die automatisch da sind: "+aKonstruktor.getModell());
*/
        //2. Konstruktor mit User Werte.
        Auto aKU = new Auto("SABA",2000);
        System.out.println("Die Info übers Auto-Hersteller, die selbe eingegeben sind: "+aKU.getHersteller());
        System.out.println("Die Info übers Auto-Modell, die selbe eingegeben sind: "+aKU.getModell());

      /*  //3. ohne Konstruktor, wie geben die Werte selbe dann ein.
        Auto a1 = new Auto();// objekt aus der Funktion der klasse Auto .  // a1 = Variablename
        System.out.println("Bitte geben Sie den Hersteller des Autos:");
        a1.setHersteller(input.next()); // so kommt man an die Variable an , zu befüllen oder zuzugreifen .
        System.out.println("Bitte geben Sie das Jahr der Auto-Modell:");
        a1.setModell(input.nextInt());

        System.out.println("Die Info übers Auto-Hersteller, die Sie schon eingegeben haben: "+a1.getHersteller());
        System.out.println("Die Info übers Auto-Modell, die Sie schon eingegeben haben: " +a1.getModell());

        // anderes Objekt

        System.out.println("\t\t\t Das zweite Auto");

        Auto a2 ;
        a2= new Auto();
        a2.setHersteller("Merceds");
        a2.setModell(2022);
        System.out.println("Die Info übers Auto-Hersteller, die Sie schon eingegeben haben: "+a2.getHersteller());
        System.out.println("Die Info übers Auto-Modell, die Sie schon eingegeben haben: "+a2.getModell());
*/
    }
}
