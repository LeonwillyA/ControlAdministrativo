package modelos;

public class Propietario extends Humano{
    //Private pare encapsulamiento
    private double cuota_recibo;
    private String numero_departamento;

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

    @Override
    public void informacionUsuarios() {
        System.out.println("Residente del Condominio Terrezas del Sol");
        System.out.println("Piso en el que esta viviendo");
    }
}
