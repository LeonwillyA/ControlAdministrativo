package modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
//En esta clase va todas las variables y metodos
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

       public void addTareasConserje (String hora, String dia, String task){

            tareasConserjes.add(new Administrador.TareasConserje(hora, dia, task));
       }

       public ArrayList<TareasConserje> getTareasConserjes(){
           return tareasConserjes;
       }

    @Override
    public String toString() {
        return super.toString() + "\n"+ "\n Distribución de tareas del personal de conserjeria: " + tareasConserjes;
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
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        public TareasConserje(String hora, String dia, String task){
            this.hora = hora;
            try {
                /*  la línea de código "this.dia = format.parse(dia);"
                toma una cadena de texto que representa una fecha ("dia"), la analiza usando el formateo
                de fecha proporcionado por el objeto "format" y asigna el resultado a la variable miembro
                "dia" de la instancia actual de la clase. Esto es comúnmente utilizado cuando se trabaja
                con fechas en Java y se necesita convertir entre representaciones de cadena y objetos Date.*/
                this.dia = format.parse(dia);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
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
        //Esta es nuestra bandera que nos indica de que devuelve un objeto del tipo DATE
        public Date getDia(String DATE) {
            return dia;
        }

        public String getDia() {
            //Me va servir como bandera

            return format.format(dia);
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
