package uimenu;
import modelos.Administrador;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIConserjeMenu {
    public static void mostrarMenuConserje(){
        int response=0;
        do{
            System.out.println("\n \n ");
            System.out.println(" :: TAREAS PROGRAMADAS :: ");
            //En este punto se puede observar que se utiliza la variable global
            // administradorLogeado.
            //Si solo coloco MenuUI.conserjeLogeado me va a establecer el esquema de la información
            // predeterminada dentro de la clase padre Humano.
            System.out.println(" Un gusto poder atenderte Sr. " + MenuUI.conserjeLogeado.getApellidos());
            System.out.println("1. Visualizar las tareas");
            System.out.println("2. Dar OK a las tareas realizadas ");
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response == 1){
                System.out.println("Las tareas indicadas por el administrador: ");
                for (Administrador administradorsTareasMostrada : UIAdministradorMenu.administradorsTareasMostradas) {
                    System.out.println(UIAdministradorMenu.administradorsTareasMostradas);
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
            Map<Integer,Map<Integer,Administrador>> administradors = new TreeMap<>();
            int k=0;
            for (int i = 0; i < UIAdministradorMenu.administradorsTareasMostradas.size(); i++) {
                ArrayList<Administrador.TareasConserje> tareasConserjes = UIAdministradorMenu.administradorsTareasMostradas.get(i).getTareasConserjes();
                Map<Integer,Administrador> administradorTareasAlConserje = new TreeMap<>();
                for (int j = 0; j < tareasConserjes.size(); j++) {
                    System.out.println(k + ". " + tareasConserjes.get(j).getDia());
                    administradorTareasAlConserje.put(Integer.valueOf(j),UIAdministradorMenu.administradorsTareasMostradas.get(i));
                    administradors.put(Integer.valueOf(k),administradorTareasAlConserje);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDiaSeleccionado = Integer.valueOf(sc.nextLine());
            
        } while (response != 0);
    }
}
