package es3;

public class Articolo {

    private String codice;
    private String descrizione;
    private double prezzo;

    private int pezziDisponibili;

    public Articolo(String codice, String descrizione, double prezzo, int pezziDisponibili){

        this.codice=codice;
        this.descrizione=descrizione;
        this.prezzo=prezzo;
        this.pezziDisponibili=pezziDisponibili;


    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getCodice() {
        return codice;
    }
}
