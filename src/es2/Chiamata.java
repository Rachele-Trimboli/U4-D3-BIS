package es2;

public class Chiamata {

    double minuti;
    String numeroChiamato;

    public Chiamata(double minuti, String numeroChiamato){
        this.minuti = minuti;
        this.numeroChiamato = numeroChiamato;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "minuti=" + minuti +
                ", numeroChiamato='" + numeroChiamato + '\'' +
                '}';
    }
}
