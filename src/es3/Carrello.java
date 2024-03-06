package es3;

public class Carrello {

    Cliente cliente;
    Articolo[] articoli;

    public Carrello(Cliente cliente, Articolo[] articoli){
        this.cliente=cliente;
        this.articoli = articoli;
    }


    public static double prezzoTotale(Articolo[] articoli){

        double somma = 0;

        for (int i = 0; i<articoli.length; i++){

            somma += articoli[i].getPrezzo();

        }
        return(somma);
    }


}
