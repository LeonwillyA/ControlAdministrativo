public class Vigilante extends Humano{
    private String ocurrencias;
    private String registro_visitas;
    private String registro_paqueteria;

    Vigilante (String nombres, String apellidos, String mail){
        super(nombres,apellidos, mail);
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
