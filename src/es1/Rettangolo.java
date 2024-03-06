package es1;

public class Rettangolo {

    private double altezza;
    private double base;
    private double perimetro;
    private double area;



    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
        this.perimetro = perimetroRettangolo();
        this.area = areaRettangolo();
    }

    public double getBase(){
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public double perimetroRettangolo (){
        return (base+altezza)*2;

    }

    public double areaRettangolo (){
        return base*altezza;
    }



    public void stampaRettangolo(){
        System.out.println("Questo è il suo perimetro " + perimetro);
        System.out.println("Questa è la sua area " + area);
    }



    public static void stampaDueRettangoli(Rettangolo r1 , Rettangolo r2){

        System.out.println(" Perimetro1 "+r1.getPerimetro());
        System.out.println("Area1 "+r1.getArea());
        System.out.println(" Perimetro2 "+r2.getPerimetro());
        System.out.println(" Area2 "+r2.getArea());

        System.out.println("Somma delle aree " + (r1.getPerimetro() + r2.getPerimetro()));
        System.out.println("Somma dei perimetri " + (r1.getArea() + r2.getArea()));
    }

}
