package modelos;

import java.util.Date;

public class TareasConserje implements ICronograma {
    private int id;
    private Conserje conserje;
    private Administrador administrador;
    private Date dia;
    private String time;
    private String task;
    /*Faltaba el metodo constructor, ya que al momento de hacer el addTareasConserjes en la clase
    Conserje me salia en rojo*/
    public TareasConserje(Conserje conserje, Administrador administrador) {
        this.conserje = conserje;
        this.administrador = administrador;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conserje getConserje() {
        return conserje;
    }

    public void setConserje(Conserje conserje) {
        this.conserje = conserje;
    }

    public Date getDate() {
        return dia;
    }

    public void setDate(Date dia) {
        this.dia = dia;
    }

    public String getTime() {
        return time + " hrs. ";
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
    /*Se ejecuta solo hasta que se llame al método Cronograma */
    @Override
    public void Cronograma(Date dia, String time, String task) {
        this.dia = dia;
        this.time = time;
        this.task = task;
    }
}
