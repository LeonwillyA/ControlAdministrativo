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
            /*Vamos a empezar con el Map, mostrando las fechas de los administradores que ya dejaron las ordenes a los
            conserjes, el primer Key va ser un entero, recordar que es una coleccion de objetos y que Int no va
            funcionar y qe tenemos que colocar Integer, y que este primer Integer va llevar la numeracion de la
            lista de fechas, en este punto se va almacenar en modo de indice la numeración de la lista de fechas, y para
            eso es lo que vamos a utilizar otro Map, y que tambien va llevar un Key, y el value que va tener es un Administrador.
            Con respecto al Administrador, cada uno de ellos van a tener un arr
            1.- Administrador 1
                    1.- echa 1
                    2.- Fecha 2
            2.- Administrador 2
            3.- Administrador3
            */
            Map<Integer,Map<Integer,Administrador>> administradors = new TreeMap<>();
            int k=0;
            /*Vamos a recorrer el array administradorsTareasMostradas para poder extraer las fechas de las tareas*/
            for (int i = 0; i < UIAdministradorMenu.administradorsTareasMostradas.size(); i++) {
                /*Un array donde vamos a estar caṕturando los ok de las tareas realizadas. Vamos a recorrer al administrador
                * que tiene las tareas colocadas, y luego le solicio las tareas por realizar y se asigno en este objeto
                * /coleccion getTareasConserjes
                *  */
                ArrayList<Administrador.TareasConserje> tareasConserjes = UIAdministradorMenu.administradorsTareasMostradas.get(i).getTareasConserjes();
                /*Ahora voy a pasar a  Map<Integer,Administrador>, y lo coloco como treeMap(Como nuestra relación es compleja
                vamos a utilizar la estructura tipo arbol)*/
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
