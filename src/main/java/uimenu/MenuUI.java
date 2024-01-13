package uimenu;

import modelos.Propietario;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
    public static mostrarMenu(){
        System.out.println("Administración de Actividades");
        System.out.println("Seleccione el tipo de usuario al cual perteneces: ");

        int response = 0;
        do{
            System.out.println("1. Propietario");
            System.out.println("2. Conserje");
            System.out.println("3. Vigilante");
            System.out.println("4. Administrador");
            System.out.println("0. Salir");

            Scanner ac = new Scanner(System.in);

            switch (response){
                case 1:
                    System.out.println("Bienvenido propietario");
                    response = 0;
                    mostrarPropietarioMenu();

                break;
                case 2:
                    System.out.println("Bienvenido Conserje");
                    break;
                case 3:
                    System.out.println("Bienvenido Vigilante");
                    break;
                case 4:
                    System.out.println("Bienvenido Administrador");
                    break;
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;

                default:
                    System.out.println("Elige una opción correcta");
            }
        }while (response !=0 );
    }
    private static void autenticarHumano (int humanType){
        // humanType = 1 Propietario
        // humanType = 2 Conserje
        // humanType = 3 Vigilante
        // humanType = 4 Administrador
        // Vamos hacer una lista en un array como prueba, para posteriormente utilizar una base de datos
        ArrayList<Propietario> propietarios = new ArrayList<>();
        propietarios.add(new Propietario("","",""));
    }

    static void mostrarPropietarioMenu(){}
}
