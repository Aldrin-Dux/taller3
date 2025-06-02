package taller3;

public class Problema1_Terreno {

    public static Terreno terrenoD = new Terreno();

    public static void main(String[] args) {
        double ancho = (Math.random() * 10) + 1;
        double largo = (Math.random() * 10) + 1;
        double valor_metro = (Math.random() * 10) + 1;
        terrenoD.setAncho(ancho);
        terrenoD.setLargo(largo);
        terrenoD.setValorMetro(valor_metro);

        terrenoD.calcularArea();
        terrenoD.calcularCosto();

        System.out.print("Datos del terreno: " + terrenoD.toString());
    }
}

class Terreno {

    public double ancho;
    public double largo;
    public double valorMetro;
    public double areaTerreno;
    public double costoTerreno;

    public Terreno() {

    }

    public Terreno(double ancho, double largo, double valorMetro) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetro = valorMetro;
    }

    public void calcularArea() {
        this.areaTerreno = this.ancho * this.largo;
    }

    public void calcularCosto() {
        this.costoTerreno = this.areaTerreno * this.valorMetro;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getLargo() {
        return this.largo;
    }

    public void setValorMetro(double valorMetro) {
        this.valorMetro = valorMetro;
    }

    public double getValorMetro() {
        return this.valorMetro;
    }

    public double getArea() {
        return this.areaTerreno;
    }

    public double getCosto() {
        return this.costoTerreno;
    }

    public String toString() {
        return "\n{Ancho: " + this.getAncho()
                + "\nLargo: " + this.getLargo()
                + "\nValor por metro: " + this.getValorMetro()
                + "\nValor del area: " + this.getArea()
                + "\nValor del terreno: " + this.getCosto()
                + "}\n";
    }
}
