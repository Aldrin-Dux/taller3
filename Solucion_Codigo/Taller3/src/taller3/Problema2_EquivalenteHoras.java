package taller3;
public class Problema2_EquivalenteHoras {
    public static EquivalenteHora horasD = new EquivalenteHora();
    public static void main(String[] args) {
        int horas = (int) ((Math.random() * 10) + 1);
        horasD.setHoras(horas);
        horasD.calcularMinutos();
        horasD.calcularSegundos();
        horasD.calcularDias();
        System.out.println("Las horas ingresadas a sus datos equivalente: " + horasD.toString());
    }
}
class EquivalenteHora {
    public int horas;
    public int minutos;
    public int segundos;
    public int dias;
    public EquivalenteHora(){
    }

    public EquivalenteHora(int horas) {
        this.horas = horas;
    }

    public void calcularMinutos(){
        this.minutos = this.horas * 60;
    }
    public void calcularSegundos(){
        this.segundos = this.horas * 3600;
    }
    public void calcularDias(){
        this.dias = this.horas / 24;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
    public int getHoras(){
        return this.horas;
    }
    public int setMinutos(int minutos){
        return this.minutos=minutos;
    }
    public int getMinutos(){
        return this.minutos;
    }
    public int setSegundos(int segundos){
        return this.segundos=segundos;
    }
    public int getSegundos(){
        return this.segundos;
    }
    public int setDias(int dias){
        return this.dias= dias;
    }
    public int getDias(){
        return this.dias;
    }
    
    public String toString(){
        return "\nHoras: " + this.getHoras()
                + "\nMinutos: " + this.getMinutos()
                + "\nSegundos: " + this.getSegundos()
                + "\nDias: " + this.getDias()
                + "\n"
                ;
    }
}
