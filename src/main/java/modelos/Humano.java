package modelos;
/**La clase humano esta catalogada como 'SUPER CLASE', Esta clase abstracta se genera como Herencia a los clases administrador, vigilante, conserje y propietario
 Lo que se esta queriendo heredar como información primordial es nombres, apellidos y mail, pero
 se tiene en cuenta de que hay otros valores que tambien se pueden mostrar
 */
public abstract class Humano {
    private int id;
    private String nombres;
    private String apellidos;
    private String dni;
    private String mail;
    private String phonenumber;
    /** El constructor humano, que va heredar:
     * @param apellidos : Los apellidos que tendran cualquier cualquier usuario que ingrese a la aplicacion
     * @param nombres : Los nombres que tendran cualquier cualquier usuario que ingrese a la aplicacion
     * @param mail : Es el correo con el cual va a verificarse el usuario
     * */
    public Humano(String nombres, String apellidos, String mail) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.mail = mail;
    }
    //Se generan los getter y setters
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
        if(dni.length() == 8){
            this.dni = dni;
        } else {
            System.out.println("Numero incorrecto, favor de colocar uno bueno");
        }
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhonenumber() {
        return null;
    }

    public void setPhonenumber(String phonenumber) {
        if(phonenumber.length() == 9){
            this.phonenumber = phonenumber;
        } else {
            System.out.println("Colocar un correcto número de celular");
        }
    }
    /**Con este @Override indico la información que se va transmitir por medio del super a las clases Administrador, Conserje, propietario y vigilante
     * Podemos retornar mayor información, pero esta se retornara solo 3 informaciones que utilizaremos para esta tarea, y lo otro se guardara dentro de su perfil
     * @return nombres, apellido y mail
     * */
    @Override
    public String toString() {
        return "Nombre: " + nombres + " //Apellido: " + apellidos
                + "\n //Correo: " + mail + "\n //Numero de Celular: " + phonenumber;
    }

    public abstract void informacionUsuarios();

}
