package uimenu;

import modelos.Administrador;
import modelos.Conserje;
import modelos.Propietario;
import modelos.Vigilante;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
    public static final String [] MONTHS = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Administrador administradorLogeado;
    public static Conserje conserjeLogeado;
    public static Vigilante vigilanteLogeado;
    public static  Propietario propietarioLogeado;

    //Esto es el menu principal, es la parte de la información principal que se mostrara primero al usuario
    public static void mostrarMenu(){
        System.out.println("Administración de Actividades");
        System.out.println("Seleccione el tipo de usuario al cual perteneces: ");

        int response = 0;
        do{
            System.out.println("1. Propietario");
            System.out.println("2. Conserje");
            System.out.println("3. Vigilante");
            System.out.println("4. Administrador");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Bienvenido propietario");
                    response = 0;
                    autenticarHumano(1);
                break;
                case 2:
                    System.out.println("Bienvenido Conserje");
                    response = 0;
                    autenticarHumano(2);
                    break;
                case 3:
                    System.out.println("Bienvenido Vigilante");
                    response = 0;
                    autenticarHumano(3);
                    break;
                case 4:
                    System.out.println("Bienvenido Administrador");
                    response = 0;
                    autenticarHumano(4);
                    break;
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;

                default:
                    System.out.println("Elige una opción correcta");
            }
        }while (response !=0 );
    }

    /**Luego de que el usuario elige la opcion con la cual se identifica se procede a autenticar por medio del correo
     * @param humanType : con esta opción se verifica el correo con el cual se asocia al tipo de usuario.
     * */
    private static void autenticarHumano (int humanType){
        // humanType = 1 Propietario
        // humanType = 2 Conserje
        // humanType = 3 Vigilante
        // humanType = 4 Administrador
        // Vamos hacer una lista en un array como prueba, para posteriormente utilizar una base de datos
        /* Es como si fuera a mi capa de persistencia de datos y me trajera todos los usuarios que tengo
        registrado, dependiento del tipo de usuario que sea.*/
        /*ArrayList <Propietario= Es la clase Propietario> propietarios viene a ser como la variable
        * para poder invocarlo*/

        // Lista de usuarios propietarios
        ArrayList<Propietario> propietarios = new ArrayList<>();
        propietarios.add(new Propietario("Gianfranco","Chirinos Mendoza","gchi@mail.com"));

        // Lista de usuarios vigilantes
        ArrayList<Vigilante> vigilantes = new ArrayList<>();
        vigilantes.add(new Vigilante("Paco","Mero Mero","pamm@mail.com"));

        // Lista de usuarios de conserjes.
        ArrayList<Conserje> conserjes  = new ArrayList<>();
        conserjes.add(new Conserje("Jose","Rivadeneyra","jri@mail.com"));
        conserjes.add(new Conserje("Jaime","Canchari","jca@mail.com"));
        conserjes.add(new Conserje("Carlos","Padilla","cpa@mail.com"));

        // Lista de usuarios administradores
        ArrayList<Administrador> administradors = new ArrayList<>();
        administradors.add(new Administrador("Carlos","Urriate","curr@mail.com"));
        administradors.add(new Administrador("Willy","Leónidas","wle@mail.com"));
        administradors.add(new Administrador("Lesly","Lucano Angeles", "leslyla02@gmail.com"));

        /* Con esta condicional podemos verificar que usuario es el que esta ingresando, tener en cuenta que tambien se le
         * le puede colocar una contraseña para la verificación.
         * */
        boolean emailCorrect = false;
        do {
            /* Una vez que elijo una opcion de usuario, a todas las opciones les saldra el texto para
            que ingresen su correo*/
            System.out.println("Inserta tu correo electronico: ");
            /* El Scanner se utiliza para leer la entrada del usuario desde la consola (System.in).
            *Se utiliza el método nextLine() del objeto Scanner para leer una línea completa de la entrada
            * del usuario desde la consola. La línea ingresada por el usuario se almacena en la variable email
            * */
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            /* */
            if (humanType == 1){
                /*for() permite recorrer  todos los elementos de una colección o array y ejecutar un bloque
                de código para cada elemento .
                -Propietario p: Declara una variable p del tipo Propietario. Esta variable se utilizará para representar cada
                elemento individual de la colección o array propietarios en cada iteración del bucle.
                -propietarios: Es la colección o array sobre la cual se va a iterar. En cada iteración del bucle,
                la variable p tomará el valor de uno de los elementos de esta colección o array.*/
                //En resumen, la expresión for (Propietario p : propietarios) se puede interpretar como "para cada Propietario p en la colección propietarios, ejecuta el bloque de código dentro del bucle". Esto significa que el bloque de código dentro del bucle se ejecutará una vez para cada Propietario en la colección propietarios, y dentro de ese bloque, p representará el Propietario actual en cada iteración.
                for (Propietario p: propietarios){
                    if (p.getMail().equals(email)){
                        emailCorrect = true;
                        propietarioLogeado = p;

                        //Indicar la conformidad de que se ha logeado
                    }}
            }

            if (humanType == 2){
                for (Conserje c:conserjes){
                    if (c.getMail().equals(email)){
                        emailCorrect = true;
                        conserjeLogeado = c;
                        UIConserjeMenu.mostrarMenuConserje();
                    //Indicar la conformidad de que se ha logeado
                }}
            }

            if (humanType == 3){
                for (Vigilante v:vigilantes){
                    if (v.getMail().equals(email)){
                        emailCorrect = true;
                        vigilanteLogeado = v;
                        //Indicar la conformidad de que se ha logeado
                    }}
            }

            if (humanType == 4){
                for (Administrador a: administradors){
                    if (a.getMail().equals(email)){
                        emailCorrect = true;
                        administradorLogeado = a;
                        UIAdministradorMenu.mostrarMenuAdministrador();

                    }}}
        }while (emailCorrect == false);{}

    }


}
