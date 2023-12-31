public class Propietario {
    static int id_propietario = 0;
    double cuota_recibo;
    String nombre;
    String numero_departamento;
    String dni;

    String phonenumber;
    String mail;

    public Propietario (String nombre, String numero_departamento){
        id_propietario++;
        this.nombre = nombre;
        this.numero_departamento = numero_departamento;

    }

    public void mostrarNombre(){
        System.out.println(nombre);
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

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
