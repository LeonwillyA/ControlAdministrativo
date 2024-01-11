import modelos.*;

import java.util.Date;

public class Inicio {
    public static void main(String[] args) {
    modelos.Propietario myPropietario = new modelos.Propietario("Willy", "León Lucano","wll@mail.com");

    modelos.Propietario myPropietarioA = new modelos.Propietario("Gian Franco", "Chirinos Carrasco", "gfchc@mail.com");
        myPropietario.setCuota_recibo( 122.4);
        myPropietario.setNumero_departamento("1812");
        System.out.println(myPropietario);
        System.out.println(myPropietario.getCuota_recibo());
        myPropietario.setPhonenumber("999123565");
        System.out.println(myPropietario.getPhonenumber());
        myPropietario.setDni("45454545");
        System.out.println(myPropietario.getDni());

    Administrador myAdministrador = new Administrador("Ricardo Angel", "Guerrero Solis", "rags@mail.com");


        System.out.println("El administrador tiene conocimiento que el metraje total de la suma de todos los departamentos y estacionamiento es el siguiente: " + myAdministrador.getMetrajeTotal());

        myAdministrador.addTareasConserje("07:00 hrs", new Date(), "Limpieza del hall del edificio N° 1");
        myAdministrador.addTareasConserje("09:00 hrs",new Date() , "Limpieza de los 3 ascensores");
        System.out.println(myAdministrador);

     myPropietario.setMetraje(42);
        System.out.println(myPropietario.getMetraje());
        System.out.println("La fracción total del pago que se desea realizar para dicho propietario es el siguiente: " + (myPropietario.getMetraje()/ myAdministrador.getMetrajeTotal()));
        myAdministrador.setGastosTotales(32300.55);
        System.out.println("La cuota del recibo del departamente N°: " + myPropietario.getNumero_departamento() +
                " viene a ser un monto de: " + (myAdministrador.getGastosTotales()*myPropietario.getMetraje()/ myAdministrador.getMetrajeTotal()));


       double zeta = 0;

        if (zeta == 22.23232 ) {
            System.out.println("Esto es tremendo");
        } else {
            System.out.println("Esto es una porqueria");
        }

        /*Humano humano = new Administrador(  "Riki", "Rikon", "tt@gmail.com");
        humano.informacionUsuarios();

        Humano humanito = new Propietario("Paco cantinflas", "Ochoa Bellido", "pcob@gmail.com");
        humanito.informacionUsuarios();

        Humano humanit1 = new Humano("alonso","parraga","apg@mail.com") {
            @Override
            public void informacionUsuarios() {
                System.out.println("Usuario del backend del sistema");
            }
        };

        humanit1.informacionUsuarios();

        Humano humane = new Humano("Joaco","Ochoa","smm@mail.com") {
            @Override
            public void informacionUsuarios() {
                System.out.println("Usuario del frontend del sistema");
            }
        };
        humane.informacionUsuarios();


        ICronograma iCronograma = new ICronograma() {
            @Override
            public void Cronograma(Date date, String time, String task) {
                System.out.println("En proceso de construccion del sistema de control");
            }
        };

        iCronograma.Cronograma(new Date(),"11:00 horas", "Descanso");

        ICronograma iCronograma1 = new TareasConserje();
        iCronograma1.Cronograma(new Date(),"11:00 horas", "Descanso");




        /*for (modelos.Administrador.TareasConserje ss: myAdministrador.getTareasConserjes()){
            System.out.println("LLLLLLLLLLLLLLLLLDía: " + ss.getDia() + " \n " + "Hora de inicio: " + ss.getHora() + " \n " + "Función a realizar: " + ss.getTask());
        }*/


    /*System.out.println(myPropietario.id_propietario + ". El nombre del propietario que vive en el departamento: "
                + myPropietario.numero_departamento + " del Condominio Terrazas del sol - Campoy es : " + myPropietario.nombre);
    System.out.println(myPropietarioA.id_propietario + ". El nombre del propietario que vive en el departamento: "
                + myPropietarioA.numero_departamento + " del Condominio Terrazas del sol - Campoy es : " + myPropietarioA.nombre);*/


        /*System.out.println(myPropietario.id_propietario + ". El nombre del propietario del Condominio Terrazas del sol - Campoy: " + myPropietario.nombre );
        System.out.println(myPropietario.id_propietario + ". El nombre del propietario del Condominio Terrazas del sol - Campoy: " + myPropietarioA.nombre );*/
    }
}
