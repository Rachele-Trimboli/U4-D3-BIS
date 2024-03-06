import es1.Rettangolo;
import es2.Chiamata;
import es2.Sim;
import es3.Articolo;
import es3.Carrello;
import es3.Cliente;

import static es2.Sim.stampaSim;

public class Main {
    public static void main(String[] args) {

        Rettangolo r1 = new Rettangolo(10,10);
        Rettangolo r2 = new Rettangolo(20,10);

        r1.stampaRettangolo();

        Rettangolo.stampaDueRettangoli(r1,r2);

        Chiamata chiamata1 = new Chiamata(50, "12356987");
        Chiamata chiamata2 = new Chiamata(59, "258745");
        Chiamata chiamata3 = new Chiamata(30.2, "15975364");
        Chiamata chiamata4 = new Chiamata(21.6, "336985");
        Chiamata chiamata5 = new Chiamata(40, "125478");
        Chiamata chiamata6 = new Chiamata(39, "326598");
        Chiamata chiamata7 = new Chiamata(35.4, "2513647");
        Chiamata chiamata8 = new Chiamata(37.2, "854697");


        Sim s1 = new Sim("123456789");
        s1.getChiamate()[0] = chiamata1;
        s1.getChiamate()[1] = chiamata2;
        s1.getChiamate()[2] = chiamata3;
        s1.getChiamate()[3] = chiamata4;
        s1.getChiamate()[4] = chiamata5;
        stampaSim(s1);


        Cliente c1 = new Cliente("t6sgc6", "Mario", "Bros", "mario@bros.com", "15/03/99" );

        Articolo articolo1 = new Articolo("gshtdnf", "lavatrice", 250.99, 150);
        Articolo articolo2 = new Articolo("hjgbvsdf", "Smartphone", 120, 50);

        Articolo[] articoliSelezionati = {articolo1 , articolo2};
        Carrello carrello1= new Carrello(c1, articoliSelezionati);

        double totale = Carrello.prezzoTotale(articoliSelezionati);

        System.out.println("Sono " + c1.getNome() + " " + c1.getCognome() + " ho comprato " + articolo1.getDescrizione() + " e " + articolo2.getDescrizione() + " al prezzo totale di: " + totale + " euro ");





    }

}
