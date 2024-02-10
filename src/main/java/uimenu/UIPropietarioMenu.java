package uimenu;

import java.util.Scanner;

public class UIPropietarioMenu {
    /** el menu de mostrarMenuPropietario indicara 5 opciones, y de cada opcion ya se creo su respectivo metodo */
    public static void mostrarMenuPropietario(){

        int response = 0;
        do{
            System.out.println(".--------------------------.");
            System.out.println("\n \n");
            System.out.println("Propietario");
            System.out.println( "Bienvenido Sr. " + MenuUI.propietarioLogeado.getApellidos());
            System.out.println("1.- Desea ver su recibo proximo a vencer");
            System.out.println("2.- Desea ver los equipos que necesitan mantenimientos correctivos");
            System.out.println("3.- Desea ver las fechas de los mantenimientos de equipos ");
            System.out.println("4.- Desea ver el cronograma de limpieza de los conserjes");
            System.out.println("5.- Desea ver los informes por los incidentes ocasionados en el condominio");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    ultimoRecibo();
                    break;
                case 2:
                    informeMantenimientoCorrectivo();
                    break;
                case 3:
                    informeMantenimientoPreventivo();
                    break;
                case 4:
                    cronogramaLimpieza();
                    break;
                case 5:
                    informeIncidentes();
                    break;
                case 0:
                    MenuUI.mostrarMenu();
                    break;

            }
        }
        while (response != 0);
    }
    /**Lineas abajo se muestra los metodos que son de parte del menu de eleccion que tendra para elegir el propietario */
    private static void ultimoRecibo() {
        System.out.println("El precio del recibo es el siguiente: ");
    }
    private static void informeMantenimientoPreventivo() {
        System.out.println("Los mantenimientos preventivos de los equipos son los siguientes: ");
    }
    private static void informeMantenimientoCorrectivo() {
        System.out.println("Los mantenimientos correctivos de los equipos son los siguientes: ");
    }
    private static void cronogramaLimpieza() {
        System.out.println("El cronograma actualizado de limpieza es el siguiente: ");
    }
    private static void informeIncidentes() {
        System.out.println("Los incidentes que han ocurrido en el condominio son: ");
    }
}
