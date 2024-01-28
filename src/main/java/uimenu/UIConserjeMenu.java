package uimenu;

import modelos.Administrador;

import java.util.Scanner;

public class UIConserjeMenu {
    public static void mostrarMenuConserje(){
        int response=0;
        do{
            System.out.println("\n \n ");
            System.out.println(" :: TAREAS PROGRAMADAS :: ");
            System.out.println(" Un gusto poder atenderte " + MenuUI.conserjeLogeado);
            System.out.println("1. Visualizar las tareas");
            System.out.println("2. Dar OK a las tareas realizadas ");
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response == 1){
                System.out.println("Las tareas indicadas por el administrador: ");
                for (Administrador administradorsTareasMostrada : UIAdministradorMenu.administradorsTareasMostradas) {
                    return;
                }

            } else if (response == 2) {
                System.out.println("Indicar las tareas que le daras ok: ");
            } else if (response == 0) {
                MenuUI.mostrarMenu();
            }
        }
        while (response != 0);
    }

    private static void mostrarTareasOrdenadasAdministrador(){
        int response = 0;

        do {
            System.out.println("Las tareas a realizar se muestra a continuación: ");
        } while (response != 0);
    }
}
