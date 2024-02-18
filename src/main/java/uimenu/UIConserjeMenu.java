package uimenu;
import modelos.Administrador;

import javax.print.Doc;
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
                    1.- Fecha 1
                    2.- Fecha 2
            2.- Administrador 2
            3.- Administrador3
            */
            Map<Integer,Map<Integer,Administrador>> administradors = new TreeMap<>();
            /*Para poder capturar ese primer dato y que pueda perdurar en el ciclo, que su scope pueda ser mucho más
            * alto que el de la lista de Administradores, como tambien la lista de fechas*/
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
                /*Ahora voy acceder a tareasConserjes para mostrarla y empezar a capturarlos*/
                for (int j = 0; j < tareasConserjes.size(); j++) {
                    k++;
                    System.out.println(k + ". " + tareasConserjes.get(j).getDia());
                    /*Para poder insertar dentro de un Map, es como crear una nuvea estructura de datos, que nos va ayudar
                     * a manipular mejor la salida que le queremos estar dando a nuestros usuarios y llamar a los
                     * administradorsTareasMostradas*/
                    administradorTareasAlConserje.put(Integer.valueOf(j),UIAdministradorMenu.administradorsTareasMostradas.get(i));
                    /*Pasamos el Map que acabamos de construir*/
                    administradors.put(Integer.valueOf(k),administradorTareasAlConserje);
                }
            }
            Scanner sc = new Scanner(System.in);
            /*Con eso ya nuestro conserje va seleccionar la tarea que ya realizo*/
            int responseDiaSeleccionado = Integer.valueOf(sc.nextLine());
            /*Dependiendo de la tarea que se ha realizado, se almacenara en este punto*/
            Map<Integer, Administrador> tareaRealizada = administradors.get(responseDiaSeleccionado);
            /*Vamos a preparar una variable donde lo vamos a guardar, que es el indice de la fecha*/
            Integer indexDate = 0;
            /*Vamos a preparar otra variable, recorrer el arbol interno antes que el arbol externo*/
            Administrador administradorSeleccionado = new Administrador("","","");

            /*Vamos a recorrer nuestro map, no necesitamos los indices, sino recorrer simplemente, y vamos a colocar
            la opción de entrySet, con esto podemos tener acceso de como recorrer un Map*/

            for ( Map.Entry<Integer,Administrador> ad :tareaRealizada.entrySet()) {
                /*Necesito el indice de la fecha seleccionada, para poder obtener al administrador, donde obtengo
                el Integer. Con key obtengo el key*/
                indexDate = ad.getKey();
                /*Luego de ello puedo obtener al administrador que a designado la tarea. Con value obtengo el Administrador.
                * Con esto obtener los datos confirmados*/
                administradorSeleccionado = ad.getValue();
            }
            /*Cofirmar lo que seleccionamos*/
            System.out.println(administradorSeleccionado.getApellidos() + "Fecha: " + administradorSeleccionado.getTareasConserjes().get(indexDate).getDia() +" Hora: " +
                    /*Voy a administrador que me designo la tarea, luego a las tareas de conserjes que realizo, despues de
                    * ello al arbol con indexDate y al final encontra la hora que necesito que se vea*/
                    administradorSeleccionado.getTareasConserjes().get(indexDate).getHora() + "Tarea: " + administradorSeleccionado.getTareasConserjes().get(indexDate).getTask());
            System.out.println("Confirmar si la tarea realizada es la correcta: \n1. Si \n2. No");
            response = Integer.valueOf(sc.nextLine());
            if (response == 1){}

        } while (response != 0);
    }
}
