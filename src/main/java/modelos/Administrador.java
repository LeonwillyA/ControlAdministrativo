package modelos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**La clase Administrador esta catalogada como 'SUB CLASE'.
En esta clase va todas las variables, metodos y clases anidadas*/
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
    /** Se agregara la colección de objetos (ArrayList donde se se estara almacenando cada tarea que se agregue)
     * TareasConserje: Es la clase anidada.
     * tareasConserjes: Nombre de la coleccion.*/
    ArrayList<TareasConserje> tareasConserjes = new ArrayList<>();
        /** Creación de un metodo, donde se agregara infinicatas  tareas de la clase anidada tareasConserje instanciandola
         * */
       public void addTareasConserje (String hora, String dia, String task){
           //Cada vez que añada una nueva tarea, puedo estar declarando un nuevo objeto con las
           // caracteristicas hora, dia y task
            tareasConserjes.add(new Administrador.TareasConserje(hora, dia, task));
       }
       /**Devolver la lista completa de los conserjes, donde devolvera el Array
        * que hemos generado*/
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


    /**La creación de una clase estatica (CLASE ANIDADA), se da con la finalidad de evitar la creación de un Array que tuviera la colección
     * de los elementos que se encuentran dentro de la clase, a partir de ese punto es donde no se vuelve escalable.
     * hora: hora que indica el administrador para el inicio de sus actividades.
     * dia: día que realizara dicha función
     * task: La tarea que va a realizar.
     * */
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
