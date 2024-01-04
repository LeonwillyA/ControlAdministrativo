package modelos;

public class Conserje extends Humano{
    private String tareas_limpieza;
    private String tareas_jardineria;
    private String tareas_pintado;

    public Conserje (String nombres, String apellidos, String mail){
        super(nombres,apellidos, mail);
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
