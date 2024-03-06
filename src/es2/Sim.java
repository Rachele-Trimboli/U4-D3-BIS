package es2;

import java.util.Arrays;

public class Sim {

    private String numero;
    private  double credito;
    private  Chiamata[] chiamate;

    public Sim(String numero){
        this.numero=numero;
        this.credito=0;
        this.chiamate= new Chiamata[5];
    }

    public String getNumero() {
        return numero;
    }

    public  double getCredito() {
        return credito;
    }

    public  Chiamata[] getChiamate() {
        return chiamate;
    }

    public static void stampaSim(Sim s1){

        System.out.println("Questo è il numero di telefono " + s1.getNumero());
        System.out.println("Questo è il credito residuo " + s1.getCredito() + "€");
        System.out.println("Queste sono le ultime 5 chiamate " + Arrays.toString(s1.getChiamate()));

    }


}
