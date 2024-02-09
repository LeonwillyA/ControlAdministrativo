package uimenu;

import modelos.Administrador;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class UIAdministradorMenu {

    public static ArrayList<Administrador> administradorsTareasMostradas = new ArrayList<>();

    public static void mostrarMenuAdministrador(){
        int response = 0;
        do {
        System.out.println(".--------------------------.");
            System.out.println("\n \n");
            System.out.println("Administrador");
            //En este punto se puede observar que se utiliza la variable global
            // administradorLogeado.
            //Si solo coloco MenuUI.administradorLogeado me va a establecer el esquema de la información
            // predeterminada dentro de la clase padre Humano.
        System.out.println( "Bienvenido Sr. " + MenuUI.administradorLogeado.getApellidos());
        System.out.println("1. Ordenar el itenirario para el conserje");
        System.out.println("2. Mostrar el itenirario del conserje");
        System.out.println("0. Logout");


        Scanner sc = new Scanner(System.in);
        response = Integer.valueOf(sc.nextLine());


            switch (response){
                case 1:
                    itinerarioTareasConserje();
                    break;
                case 2:
                    break;
                case 0:
                   MenuUI.mostrarMenu();
                    break;

            }

        }while (response != 0);

    }
    /** Con este metodo vamos a establecer las tareas que realizara el conserje durante un día establecido o un mes
     * dependiendo del caso de la programación  , estas
     * tareas seran indicadas por el Administrador. */
    private static void itinerarioTareasConserje(){
        int response = 0;
        do {
            System.out.println(" :: Agregar la tarea");
            System.out.println("Selecciona el mes");
            //Para poder elegir el mes en el cual va trabajar se va necesitar realizar un for de los meses
            // que se va seleccionar, estos meses se encuentran dentro de MenuUI (tener en cuenta que esto
            // solo muestra).
            for (int i = 1; i < 4; i++) {
                int j = i + 1;
                System.out.println(j+". "+MenuUI.MONTHS[i]);
            }
            System.out.println("0. Return");
            /* El Scanner se utiliza para leer la entrada del usuario desde la consola (System.in).
             * Integer.valueOf(sc.nextLine()) toma la cadena de caracteres leída por sc.nextLine() y
             * la convierte a un objeto de la clase Integer.*/
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response>0 && response<5){
                //mesSeleccionado: Es la variable que esta relacionado al j lineas arriba, donde indica la posición del mes
                int mesSeleccionado = response;
                System.out.println(mesSeleccionado + " . " + MenuUI.MONTHS[mesSeleccionado-1]);
                System.out.println("Inserta la fecha: dd/mm/yyyy");
                //La fecha lo guarda como un String.
                String date = sc.nextLine();

                System.out.println("Confirmar si la fecha es la correcta: " + date + "\n1. Fecha correcta \n2. Cambiar la fecha");
                int responseDate = Integer.valueOf(sc.nextLine());
                //Una vez que coloco 2, la palabra reservada continue, me regresa al punto en que tengo que volver a colocar la fecha
                if( responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insertar la hora de inicio de la actividad del día " + date + "[00:00]");
                    time = sc.nextLine();
                    System.out.println("Confirmar si la hora es la correcta: " + time + "\n1. Hora correcta \n2. Cambiar la hora");
                    responseTime = Integer.valueOf(sc.nextLine());
                }while (responseTime == 2);

                int responseTask = 0;
                String task = "";
                do {
                    System.out.println("Insertar el trabajo que realizara " + task );
                    task = sc.nextLine();
                    System.out.println("Confirmar si el trabajo que va ha realizar ha de ser la correcta: " + task + "\n1. Tarea correcta \n2. Cambiar la tarea");
                    responseTask = Integer.valueOf(sc.nextLine());
                }while (responseTask == 2);


                MenuUI.administradorLogeado.addTareasConserje(time,date,task);
                revisarAdminitradorTareasConserjes(MenuUI.administradorLogeado);

            } else if (response == 0) {
                mostrarMenuAdministrador();
            }


        }while (response != 0);
    }

    private static void revisarAdminitradorTareasConserjes(Administrador administrador){
        if (administrador.getTareasConserjes().size()>0
        && !administradorsTareasMostradas.contains(administrador)){
        administradorsTareasMostradas.add(administrador);
        }
    }
}
