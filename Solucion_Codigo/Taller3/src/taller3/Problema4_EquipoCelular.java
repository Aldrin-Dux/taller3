package taller3;

public class Problema4_EquipoCelular {

    public static void main(String[] args) {
        EquipoCelular celularD = new EquipoCelular("Android", 9.00, 2350.80, 15.70, "I8:A5:88:8U:80:S3", "5698326489563258");
        celularD.calcularCostoFinal();
        System.out.println("Datos del dispositivo\n---------------------- " + celularD.toString());
    }
}

class EquipoCelular {

    public String sistemaOperativo;
    public double tamañoPantalla;
    public double costoInicial;
    public double ivaPorcentaje;
    public double ivaCosto;
    public double costoFinal;
    public String direccionMac;
    public String direccionIMEI;

    public EquipoCelular() {
    }

    public EquipoCelular(String sistemaOperativo, double tamañoPantalla, double costoInicial, double ivaPorcentaje, String direccionMac, String direccionIMEI) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamañoPantalla = tamañoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.direccionIMEI = direccionIMEI;
    }

    public void calcularCostoFinal() {
        this.ivaCosto = this.costoInicial * (this.ivaPorcentaje / 100);
        this.costoFinal = this.costoInicial + this.ivaCosto;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setTamañoPantalla(double tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public void setCostoIncial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public void setDireccionIMEI(String direccionIMEI) {
        this.direccionIMEI = direccionIMEI;
    }

    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }

    public double getTamanioPantalla() {
        return this.tamañoPantalla;
    }

    public double getCostoIncial() {
        return this.costoInicial;
    }

    public double getIvaPorcentaje() {
        return this.ivaPorcentaje;
    }

    public String getDireccionMac() {
        return this.direccionMac;
    }

    public String getDireccionIMEI() {
        return this.direccionIMEI;
    }

    public double getIvaCosto() {
        return this.ivaCosto;
    }

    public double getCostoFinal() {
        return this.costoFinal;
    }

    public String toString() {
        return "\nSistema operativo: " + this.getSistemaOperativo()
                + "\nTamanio pantalla: " + this.getTamanioPantalla()
                + "\nCosto inicial: " + this.getCostoIncial()
                + "\nIVA porcentaje: " + this.getIvaPorcentaje()
                + "\nDireccion mac: " + this.getDireccionMac()
                + "\nDireccion IMEI: " + this.getDireccionIMEI()
                + "\nCosto del IVA inicial: " + this.getIvaCosto()
                + "\nCosto Final: " + this.getCostoFinal();
    }
}
