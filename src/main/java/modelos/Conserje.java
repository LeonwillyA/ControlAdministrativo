package modelos;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;

/**La clase Conserje esta catalogada como 'SUB CLASE'.
 En esta clase va todas las variables, metodos y clases anidadas*/
public class Conserje extends Humano{
    private String tareas_limpieza;
    private String tareas_jardineria;
    private String tareas_pintado;

    /*Vamos a dejar al conserje con el check, donde vamos a dejar los atributos de ArrayList*/
    private ArrayList<TareasConserje> tareasConserjes = new ArrayList<>();

    /*Habilitar su getter y setter, tener en cuenta que en este punto el set cambia por el add*/
    public ArrayList<TareasConserje> getTareasConserjes() {
        return tareasConserjes;
    }

    public void addTareasConserjes(Administrador administrador, Date dia, String time, String task) {
        TareasConserje tareasConserje = new TareasConserje(this, administrador)
    }

    public Conserje (String nombres, String apellidos, String mail){
        super(nombres,apellidos, mail);
    }
    /**El método informacionUsuarios se hereda de manera obligatoria por parte de la clase Padre Humano
     * ya que este método viene siendo abstracto.
     * Tener en cuenta que por más que la clase padre sea igual para todos, en el método instaurado
     * dentro de el, se puede utilizar para distintos comportamientos en cada uno de ellos*/
    @Override
    public void informacionUsuarios() {
        System.out.println("Empresa Administradora: IKIGAI");
        System.out.println("Ejectuta las funciones de limpieza");
    }



    public String getTareas_limpieza() {
        return tareas_limpieza;
    }

    public void setTareas_limpieza(String tareas_limpieza) {
        this.tareas_limpieza = tareas_limpieza;
    }

    public String getTareas_jardineria() {
        return tareas_jardineria;
    }

    public void setTareas_jardineria(String tareas_jardineria) {
        this.tareas_jardineria = tareas_jardineria;
    }

    public String getTareas_pintado() {
        return tareas_pintado;
    }

    public void setTareas_pintado(String tareas_pintado) {
        this.tareas_pintado = tareas_pintado;
    }
}
