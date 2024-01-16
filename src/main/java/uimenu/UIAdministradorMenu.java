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
}
