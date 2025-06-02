package taller3;

public class Problema6_Profesor {

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Luciana", "Garcia", 750.75, 1587742568);
        profesor1.calcularSueldoTotal();
        System.out.println("Datos Del Profesor\n---------------- " + profesor1.toString());
    }
}

class Profesor {

    public String nombre;
    public String apellido;
    public double sueldoBasico;
    public double sueldoTotal;
    public int cedula;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, double sueldoBasico, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }
    public void calcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico + (this.sueldoBasico * 0.20);
    }
    public double getSueldoTotal() {
        return this.sueldoTotal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApelllido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    public int getCedula() {
        return this.cedula;
    }

    public String toString() {
        return "\nNombre: " + this.getNombre()
                + "\nApellido: " + this.getApellido()
                + "\nSueldo Basico: " + this.getSueldoBasico()
                + "\nCedula: " + this.getCedula()
                + "\nSueldoTotal: " + this.getSueldoTotal();
    }
}
