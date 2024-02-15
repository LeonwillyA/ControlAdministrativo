package modelos;
/**La clase Propietario esta catalogada como 'SUB CLASE'.
 En esta clase va todas las variables, metodos y clases anidadas*/
public class Propietario extends Humano{
    //Private pare encapsulamiento
    private double cuota_recibo;
    private String numero_departamento;
    private double metraje;


    public double getMetraje() {
        return metraje;
    }

    public void setMetraje(double metraje) {
        this.metraje = metraje;
    }

    public Propietario(String nombres, String apellidos, String mail){
        super(nombres,apellidos, mail);
    }

    public String getCuota_recibo() {
        return "S/" + cuota_recibo;
    }

    public void setCuota_recibo(double cuota_recibo) {
        this.cuota_recibo = cuota_recibo;
    }

    public String getNumero_departamento() {
        return numero_departamento;
    }

    public void setNumero_departamento(String numero_departamento) {
        this.numero_departamento = numero_departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Recibo de la administración: " + cuota_recibo
                + "\n Numero de departamento: " + numero_departamento;
    }
    /**El método informacionUsuarios se hereda de manera obligatoria por parte de la clase Padre Humano
     * ya que este método viene siendo abstracto.
     * Tener en cuenta que por más que la clase padre sea igual para todos, en el método instaurado
     * dentro de el, se puede utilizar para distintos comportamientos en cada uno de ellos*/
    @Override
    public void informacionUsuarios() {
        System.out.println("Residente del Condominio Terrezas del Sol");
        System.out.println("Piso en el que esta viviendo");
    }
}
