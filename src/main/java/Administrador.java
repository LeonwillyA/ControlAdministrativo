public class Administrador extends Humano{

    private String designarTareasConserje;
    private String designarTareasVigilante;

    Administrador(String nombres, String apellidos, String mail){
        super(nombres,apellidos, mail);
    }

    public String getDesignarTareasConserje() {
        return designarTareasConserje;
    }

    public void setDesignarTareasConserje(String designarTareasConserje) {
        this.designarTareasConserje = designarTareasConserje;
    }

    public String getDesignarTareasVigilante() {
        return designarTareasVigilante;
    }

    public void setDesignarTareasVigilante(String designarTareasVigilante) {
        this.designarTareasVigilante = designarTareasVigilante;
    }
}
