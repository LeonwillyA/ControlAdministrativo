package uimenu;

public class UIPropietarioMenu {
    public static void mostrarMenuPropietario(){
        System.out.println("Bienvenido querido Propietario: ");
        System.out.println("Selecciona la opción que requiera: ");
        int response = 0;
        do{
            System.out.println("1.- Desea ver su recibo proximo a vencer");
            System.out.println("2.- Desea ver los equipos que necesitan mantenimientos correctivos");
            System.out.println("3.- Desea ver las fechas de los mantenimientos de equipos ");
            System.out.println("4.- Desea ver el cronograma de limpieza de los conserjes");
            System.out.println("5.- Desea ver los informes por los incidentes ocasionados en el condominio");
        }
        while (response != 0);
    }
}
