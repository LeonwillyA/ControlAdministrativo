package uimenu;

import java.util.Scanner;

public class UIAdministradorMenu {

    public static void mostrarMenuAdministrador(){
        int response = 0;
        do {
        System.out.println(".--------------------------.");
            System.out.println("\n \n");
            System.out.println("Administrador");
        System.out.println( "Bienvenido " + MenuUI.administradorLogeado);
        System.out.println("1. Ordenar el itenirario para el conserje");
        System.out.println("2. Mostrar el itenirario del conserje");
        System.out.println("0. Logout");


        Scanner sc = new Scanner(System.in);
        response = Integer.valueOf(sc.nextLine());


            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                   MenuUI.mostrarMenu();
                    break;

            }

        }while (response != 0);

    }
    private static void mostrarTareasConserje(){
        int response = 0;
        do {
            System.out.println(" :: Agregar la tarea");
            System.out.println("Selecciona el mes");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j+". "+MenuUI.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response>0 && response<4){
                int mesSeleccionado = response;
                System.out.println(mesSeleccionado + " . " + MenuUI.MONTHS[mesSeleccionado]);
                System.out.println("Inserta la fecha: dd/mm/yy");
                String date = sc.nextLine();

                System.out.println("Confirmar si la fecha es la correcta: " + date + "\n1. Fecha correcta \n2. Cambiar la fecha");
                int responseDate = Integer.valueOf(sc.nextLine());
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

            } else if (response == 0) {
                mostrarMenuAdministrador();
            }


        }while (response != 0);
    }
}
