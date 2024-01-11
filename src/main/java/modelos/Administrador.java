package modelos;

import java.util.ArrayList;
import java.util.Date;

public class Administrador extends Humano{

    private String designarTareasVigilante;

    private double metrajeTotal;
    private double gastosTotales;

    public double getMetrajeTotal() {
        return metrajeTotal = 12355;
    }

    public void setMetrajeTotal(double metrajeTotal) {
        this.metrajeTotal = metrajeTotal;
    }

    public double getGastosTotales() {
        return gastosTotales;
    }

    public void setGastosTotales(double gastosTotales) {
        this.gastosTotales = gastosTotales;
    }

    public Administrador(String nombres, String apellidos, String mail){

        super(nombres,apellidos, mail);


    }

    ArrayList<TareasConserje> tareasConserjes = new ArrayList<>();

       public void addTareasConserje (String hora, Date dia, String task){
            tareasConserjes.add(new Administrador.TareasConserje(hora, dia, task));
       }

       public ArrayList<TareasConserje> getTareasConserjes(){
           return tareasConserjes;
       }

    @Override
    public String toString() {
        return super.toString() + "\n Tareas del vigilante: " + designarTareasVigilante + "\n Distribución de tareas del personal de conserjeria: " + tareasConserjes;
    }

    @Override
    public void informacionUsuarios() {
        System.out.println("Administrador");
        System.out.println("Genera recibos");
        System.out.println("Designan funciones");
    }

    public static class TareasConserje {
        private int id;
        private String hora;
        private Date dia;
        private String task;

        public TareasConserje(String hora, Date dia, String task){
            this.hora = hora;
            this.dia = dia;
            this.task = task;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        public Date getDia() {
            return dia;
        }

        public void setDia(Date dia) {
            this.dia = dia;
        }

        public String getTask() {
            return task;
        }

        public void setTask(String task) {
            this.task = task;
        }
        @Override
        public String toString() {
            return  "\n hora: " + hora + "\n dia: " + dia + "\n Función a realizar: " + task;
        }
    }


    public String getDesignarTareasVigilante() {
        return designarTareasVigilante;
    }

    public void setDesignarTareasVigilante(String designarTareasVigilante) {
        this.designarTareasVigilante = designarTareasVigilante;
    }

}
