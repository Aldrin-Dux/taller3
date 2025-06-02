package taller3;

public class Problema7_Automotor {

    public static void main(String[] args) {
        Automotor vehiculoD = new Automotor(17283945, "Toyota", 2018, 2025, 13500.00);
        vehiculoD.calcularValorMatricula();

        System.out.println("Datos del vehiculo\n-------------------- " + vehiculoD.toString());

    }
}

class Automotor {

    public int dni;
    public String marcaVehiculo;
    public int añoFabricacion;
    public int añoActual;
    public double valorVehiculo;
    public double valorMatricula;

    public Automotor() {

    }

    public Automotor(int dni, String marcaVehiculo, int añoFabricacion, int anioActual, double valorVehiculo) {
        this.dni = dni;
        this.marcaVehiculo = marcaVehiculo;
        this.añoFabricacion = añoFabricacion;
        this.añoActual = anioActual;
        this.valorVehiculo = valorVehiculo;
    }

    public void calcularValorMatricula() {
        this.valorMatricula = (0.002 * this.valorVehiculo) * (this.añoActual - this.añoFabricacion);
    }

    public double getValorMatricula() {
        return this.valorMatricula;
    }

    public void setCedulaDueño(int dni) {
        this.dni = dni;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setAñoActual(int añoActual) {
        this.añoActual = añoActual;
    }

    public void setValorVehiculo(int valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public int getCedulaDueño() {
        return this.dni;
    }

    public String getMarcaVehiculo() {
        return this.marcaVehiculo;
    }

    public int getAñoFabricacion() {
        return this.añoFabricacion;
    }

    public int getAñoActual() {
        return this.añoActual;
    }

    public double getValorVehiculo() {
        return this.valorVehiculo;
    }

    public String toString() {
        return "\nDni: " + this.getCedulaDueño()
                + "\nMarca del vehiculo: " + this.getMarcaVehiculo()
                + "\nAño de fabricacion: " + this.getAñoFabricacion()
                + "\nAño actual: " + this.getAñoActual()
                + "\nValor del vechiculo: " + this.getValorVehiculo()
                + "\nValor de la matricul: " + this.getValorMatricula();
    }
}
