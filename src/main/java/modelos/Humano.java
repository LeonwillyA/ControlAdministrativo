package modelos;

public abstract class Humano {
    private int id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String mail;
    private String phonenumber;

    public Humano(String nombres, String apellidos, String mail) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombres + " //Apellido: " + apellidos
                + "\n //Correo: " + mail;
    }

    public abstract void informacionUsuarios();

}
