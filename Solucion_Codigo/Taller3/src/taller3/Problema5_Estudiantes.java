package taller3;

import java.util.Random;

public class Problema5_Estudiantes {

    public static Estudiantes EstudianteD = new Estudiantes();

    public static void main(String[] args) {
        String[] nombres = {"Ana Garcia", "Luis Garcia", "Sofia Garcia", "Mateo Garcia", "Valentina Garcia", "Juliana Garcia", "Carlos Singh", "Daniela Kim"};

        Random random = new Random();
        for (int i = 0; i < nombres.length; i++) {
            int indiceNombre = random.nextInt(nombres.length);
            String nombreAleatorio = nombres[indiceNombre];
            double calificacion_materia1 = random.nextDouble() * 7 + 1;
            double calificacion_materia2 = random.nextDouble() * 5 + 1;
            double calificacion_materia3 = random.nextDouble() * 6 + 1;
            EstudianteD.setNombre(nombreAleatorio);
            EstudianteD.setCalificacion1(calificacion_materia1);
            EstudianteD.setCalificacion2(calificacion_materia2);
            EstudianteD.setCalificacion3(calificacion_materia3);
            EstudianteD.calcularPromedio();
            EstudianteD.DeterminarEstado();
            System.out.println("----------------------------------------------\nDatos del Estudiante " + i + ": " + EstudianteD.toString());
        }

    }
}

class Estudiantes {

    public String nombre_estudiante;
    double calificacion_materia1;
    double calificacion_materia2;
    double calificacion_materia3;
    double promedio;
    public String estado_estudiante;

    public Estudiantes() {

    }

    public Estudiantes(String nombre_estudiante, String estado_estudiante, double calificacion_materia1, double calificacion_materia2, double calificacion_materia3) {
        this.nombre_estudiante = nombre_estudiante;
        this.calificacion_materia1 = calificacion_materia1;
        this.calificacion_materia2 = calificacion_materia2;
        this.calificacion_materia3 = calificacion_materia3;
    }
    public void calcularPromedio() {
        this.promedio = (this.calificacion_materia1 + this.calificacion_materia2 + this.calificacion_materia3) / 3;
    }

    public void DeterminarEstado() {
        if (this.promedio >= 6.5) {
            this.estado_estudiante = "Aprobado";
        } else {
            this.estado_estudiante = "Reprobado";
        }
    }


    public void setNombre(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public void setCalificacion1(double calificacion_materia1) {
        this.calificacion_materia1 = calificacion_materia1;
    }

    public void setCalificacion2(double calificacion_materia2) {
        this.calificacion_materia2 = calificacion_materia2;
    }

    public void setCalificacion3(double calificacion_materia3) {
        this.calificacion_materia3 = calificacion_materia3;
    }

    public String getNombre() {
        return this.nombre_estudiante;
    }

    public double getCalificacion1() {
        return this.calificacion_materia1;
    }

    public double getCalificacion2() {
        return this.calificacion_materia2;
    }

    public double getCalificacion3() {
        return this.calificacion_materia3;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public String getEstablecerEstado() {
        return this.estado_estudiante;
    }


    public String toString() {
        return "\n\nNombre: " + this.getNombre()
                + "\nCalificacion materia 1: " + this.getCalificacion1()
                + "\nCalificacion materia 2: " + this.getCalificacion2()
                + "\nCalificacion materia 3: " + this.getCalificacion3()
                + "\nPromedio: " + this.getPromedio()
                + "\nEstado del estudiante: " + this.getEstablecerEstado();
    }
}
