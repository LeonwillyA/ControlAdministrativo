public class Propietario extends Humano{

    /* private es el proceso de encapsulamiento */
    private double cuota_recibo;
    private String numero_departamento;

    Propietario(String nombres, String apellidos, String mail){
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
}
