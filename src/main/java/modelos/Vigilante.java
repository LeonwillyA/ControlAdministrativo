package modelos;
/**La clase Vigilante esta catalogada como 'SUB CLASE'.
 En esta clase va todas las variables, metodos y clases anidadas*/
public class Vigilante extends Humano{
    private String ocurrencias;
    private String registro_visitas;
    private String registro_paqueteria;
    //Se forma el constructor vgilante donde se tendra los nombres, apellidos y mail.
    public Vigilante (String nombres, String apellidos, String mail){
        super(nombres,apellidos, mail);
    }
    /**El método informacionUsuarios se hereda de manera obligatoria por parte de la clase Padre Humano
     * ya que este método viene siendo abstracto.
     * Tener en cuenta que por más que la clase padre sea igual para todos, en el método instaurado
     * dentro de el, se puede utilizar para distintos comportamientos en cada uno de ellos*/
    @Override
    public void informacionUsuarios() {
        System.out.println("Empresa Administradora: IKIGAI");
        System.out.println("Ejecuta funciones de vigilancia");
    }

    public String getOcurrencias() {
        return ocurrencias;
    }

    public void setOcurrencias(String ocurrencias) {
        this.ocurrencias = ocurrencias;
    }

    public String getRegistro_visitas() {
        return registro_visitas;
    }

    public void setRegistro_visitas(String registro_visitas) {
        this.registro_visitas = registro_visitas;
    }

    public String getRegistro_paqueteria() {
        return registro_paqueteria;
    }

    public void setRegistro_paqueteria(String registro_paqueteria) {
        this.registro_paqueteria = registro_paqueteria;
    }
}
