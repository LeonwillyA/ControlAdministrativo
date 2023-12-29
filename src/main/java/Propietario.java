public class Propietario {
    int id_propietario;
    String nombre;
    String numero_departamento;
    String dni;
    double cuota_recibo;

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_departamento() {
        return numero_departamento;
    }

    public void setNumero_departamento(String numero_departamento) {
        this.numero_departamento = numero_departamento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getCuota_recibo() {
        return cuota_recibo;
    }

    public void setCuota_recibo(double cuota_recibo) {
        this.cuota_recibo = cuota_recibo;
    }
}
