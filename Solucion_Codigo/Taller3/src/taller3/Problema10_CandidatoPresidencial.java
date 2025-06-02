package taller3;

import java.util.Scanner;

public class Problema10_CandidatoPresidencial {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Candidato candidatoD = new Candidato("Luis Anthony", 37, "Todo al 1", "Luchemos juntos todos por un mundo\n"
                + "que todos podamos disfrutar, a base de esfuerzo y disciplina el mundo se forja\n ", 7);
        candidatoD.calcularEdad();

        System.out.println("\nDatos del candidato\n-------------------------" + candidatoD.toString());

        candidatoD.modificarInformacion(x);
        System.out.println("\nNuevos Datos\n--------------------------" + candidatoD.toString());
    }
}

class Candidato {

    public String nombre;
    public int edad;
    public String partidoPolitico;
    public String planGobierno;
    public int numeroPropuesta;
    public String edadRequerida;

    public Candidato() {
    }

    public Candidato(String nombre, int edad, String partidoPolitico, String planGobierno, int numeroPropuesta) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numeroPropuesta = numeroPropuesta;
    }

    public void modificarInformacion(Scanner x) {
        
        System.out.print("\nNombre: ");
        String NuevoNombre = x.nextLine();
        System.out.print("Edad: ");
        int NuevaEdad = x.nextInt();
        System.out.print("Partido politico: ");
        String NuevoPartidoPolitico = x.nextLine();
        x.nextLine();
        System.out.print("Plan de gobierno: ");
        String NuevoPlanDeGobierno = x.nextLine();
        System.out.print("Numero de propuestas: ");
        int NuevoNumeroDePropuestas = x.nextInt();

        this.nombre = NuevoNombre;
        this.edad = NuevaEdad;
        this.partidoPolitico = NuevoPartidoPolitico;
        this.planGobierno = NuevoPlanDeGobierno;
        this.numeroPropuesta = NuevoNumeroDePropuestas;
        this.calcularEdad();

    }

    public void calcularEdad() {
        if (this.edad >= 35) {
            this.edadRequerida = "Si se cumple con la edad requerida";
        } else {
            this.edadRequerida = "No se cumple con la edad requerida";
        }
    }

    public String getEdadRequerida() {
        return this.edadRequerida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public void setPlanDeGobierno(String planGobierno) {
        this.planGobierno = planGobierno;
    }

    public void setNumeroDePropuestas(int numeroPropuesta) {
        this.numeroPropuesta = numeroPropuesta;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getPartidoPolitico() {
        return this.partidoPolitico;
    }

    public String getPlanDeGobierno() {
        return this.planGobierno;
    }

    public int getNumeroDePropuestas() {
        return this.numeroPropuesta;
    }

    public String toString() {
        return "\nNombre del candidato: " + this.getNombre()
                + "\nEdad: " + this.getEdad()
                + "\nPartido Politico: " + this.getPartidoPolitico()
                + "\nPlan de Gobierno: " + this.getPlanDeGobierno()
                + "\nNumero de propuestas: " + this.getNumeroDePropuestas()
                + "\n" + this.getEdadRequerida();
    }
}
