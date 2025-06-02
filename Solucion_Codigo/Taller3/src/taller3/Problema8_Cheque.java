package taller3;

public class Problema8_Cheque {

    public static void main(String[] args) {
        Cheque chequeD = new Cheque("Kevin", "Banco Loja", 1582.30);
        chequeD.calcularComision();
        System.out.println("Datos del Cheque\n------------------------- " + chequeD.toString());
    }
}

class Cheque {

    public String nombreCliente;
    public String nombreBanco;
    public double valorCheque;
    public double comision;

    public Cheque() {

    }

    public Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }

    public void calcularComision() {
        this.comision = this.valorCheque * (0.003);
    }

    public double getComision() {
        return this.comision;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public String getNombreBanco() {
        return this.nombreBanco;
    }

    public double getValorCheque() {
        return this.valorCheque;
    }

    public String toString() {
        return "\nNombre del cliente: " + this.getNombreCliente()
                + "\nNombre del banco: " + this.getNombreBanco()
                + "\nValor del cheque: " + this.getValorCheque()
                + "\nValor de la comisión que cobra el banco: " + this.getComision();
    }
}
