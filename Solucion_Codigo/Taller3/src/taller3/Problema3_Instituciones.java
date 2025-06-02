package taller3;

public class Problema3_Instituciones {

    public static void main(String[] args) {
        InstitucionEducativa institucionD = new InstitucionEducativa("Universidad Nacional De Loja", "Universidad Pública", 25000, 1200, 10, 3500.75);
        institucionD.calcularPresupuesto();
        System.out.println("Datos de la Institucion\n---------------------- " + institucionD.toString());
    }
}

class InstitucionEducativa {

    public String nombre;
    public String tipoInstitucion;
    public int numeroAlumnos;
    public int numeroDocentes;
    public int numeroSedes;
    public double gastosEstudiante;
    public double presupuesto;

    public InstitucionEducativa() {

    }

    public InstitucionEducativa(String nombre, String tipoInstitucion, int numeroAlumnos, int numeroDocentes, int numeroSedes, double gastosEstudiante) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosEstudiante = gastosEstudiante;
    }

    public void calcularPresupuesto() {
        this.presupuesto = this.gastosEstudiante * this.numeroAlumnos;
    }

    public double getpresupuesto() {
        return this.presupuesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTipoInstitucion(String tipo_institucion) {
        this.tipoInstitucion = tipo_institucion;
    }

    public String getTipoInstitucion() {
        return this.tipoInstitucion;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
    }

    public int getNumeroAlumnos() {
        return this.numeroAlumnos;
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public int getNumeroDocentes() {
        return this.numeroDocentes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }

    public int getNumeroSedes() {
        return this.numeroSedes;
    }

    public void setGastosEstudiante(double gastosEstudiante) {
        this.gastosEstudiante = gastosEstudiante;
    }

    public double getGastosEstudiante() {
        return this.gastosEstudiante;
    }

    public String toString() {
        return "\nNombre: " + this.getNombre()
                + "\nTipo: " + this.getTipoInstitucion()
                + "\nNumero de alumnos: " + this.getNumeroAlumnos()
                + "\nNumero de docentes: " + this.getNumeroDocentes()
                + "\nNumero de sedes: " + this.getNumeroSedes()
                + "\nGastos proyectados por estudiante: " + this.getGastosEstudiante()
                + "\nPresupuesto: " + this.getpresupuesto();
    }
}
