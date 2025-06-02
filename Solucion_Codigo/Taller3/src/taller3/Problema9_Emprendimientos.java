package taller3;

import java.util.Scanner;

public class Problema9_Emprendimientos {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Emprendimiento EmprendimientoD = new Emprendimiento("Los pollos reyes", 196584235, "Kevin Anthony", "Comida", "Av. Asuncion, Clodoveo Jaramillo Alto", 2012, 2025, 35000.00);
        EmprendimientoD.calcularAntiguedad();
        EmprendimientoD.determinarTamaño();

        System.out.println("Datos del emprendimiento\n----------------------" + EmprendimientoD.toString());

        EmprendimientoD.ActualizarInformacion(x);
        System.out.println("-----------------------\nNuevos Datos\n----------------------------" + EmprendimientoD.toString());
    }
}

class Emprendimiento {

    public String nombreComercial;
    public int RUC;
    public String propietario;
    public String sectorEconomico;
    public String ubicacion;
    public int fechaInicioActividades;
    public int fechaActual;
    public double capitalInicial;
    public String tamañoEmprendimiento;
    public int antiguedad;

    public Emprendimiento() {

    }

    public Emprendimiento(String nombreComercial, int RUC, String propietario, String sectorEconomico, String ubicacion, int fechaInicioActividades, int fechaActual, double capitalInicial) {
        this.nombreComercial = nombreComercial;
        this.RUC = RUC;
        this.propietario = propietario;
        this.sectorEconomico = sectorEconomico;
        this.ubicacion = ubicacion;
        this.fechaInicioActividades = fechaInicioActividades;
        this.fechaActual = fechaActual;
        this.capitalInicial = capitalInicial;
    }

    public void determinarTamaño() {
        if (this.capitalInicial >= 0 && this.capitalInicial <= 2000) {
            this.tamañoEmprendimiento = "Microemprendimiento";
        } else if (this.capitalInicial >= 10001 && this.capitalInicial <= 25000) {
            this.tamañoEmprendimiento = "Pequeña empresa";
        } else if (this.capitalInicial >= 100001 && this.capitalInicial <= 100000) {
            this.tamañoEmprendimiento = "Mediano emprendimiento";
        } else {
            this.tamañoEmprendimiento = "Gran empresa";
        }
    }

    public String getTamañoEmprendimiento() {
        return this.tamañoEmprendimiento;
    }

    public void calcularAntiguedad() {
        this.antiguedad = this.fechaActual - this.fechaInicioActividades;
    }

    public int getAntiguedad() {
        return this.antiguedad;
    }

    public void ActualizarInformacion(Scanner x) {
        System.out.print("\nNombre Comercial: ");
        String NuevoNombComercial = x.nextLine();
        System.out.print("Propietario: ");
        String NuevoPropietario = x.nextLine();
        System.out.print("RUC: ");
        int NuevoRUC = x.nextInt();
        System.out.print("Sector Económico: ");
        String NuevoSectorEco = x.nextLine();
        x.nextLine();
        System.out.print("Direccion : ");
        String NuevaUbicacion = x.nextLine();

        this.nombreComercial = NuevoNombComercial;
        this.propietario = NuevoPropietario;
        this.RUC = NuevoRUC;
        this.sectorEconomico = NuevoSectorEco;
        this.ubicacion = NuevaUbicacion;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setFechaInicioActividades(int fechaInicioActividades) {
        this.fechaInicioActividades = fechaInicioActividades;
    }

    public void setFechaActual(int fecha_actual) {
        this.fechaActual = fechaActual;
    }

    public void setCapitalInicial(double capital_inicial) {
        this.capitalInicial = capitalInicial;
    }

    public String getNombreComercial() {
        return this.nombreComercial;
    }

    public int getRUC() {
        return this.RUC;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public String getSectorEconomico() {
        return this.sectorEconomico;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public int getFechaInicioActividades() {
        return this.fechaInicioActividades;
    }

    public int getFechaActual() {
        return this.fechaActual;
    }

    public double getCapitalInicial() {
        return this.capitalInicial;
    }

    public String toString() {
        return "\nNombre del comercio: " + this.getNombreComercial()
                + "\nRUC: " + this.getRUC()
                + "\nPropietario: " + this.getPropietario()
                + "\nSector economico: " + this.getSectorEconomico()
                + "\nUbicacion: " + this.getUbicacion()
                + "\nFecha de inicio de actividades: " + this.getFechaInicioActividades()
                + "\nFecha actual: " + this.getFechaActual()
                + "\nCapital inicial: " + this.getCapitalInicial()
                + "\nTamaño del emprendimiento: " + this.getTamañoEmprendimiento()
                + "\nAntiguedad del emprendimiento: " + this.getAntiguedad();
    }
}
