public class Inicio {
    public static void main(String[] args) {
    Propietario myPropietario = new Propietario("Willy", "León Lucano","wll@mail.com");

    Propietario myPropietarioA = new Propietario("Gian Franco", "Chirinos Carrasco", "gfchc@mail.com");

    myPropietario.setCuota_recibo( 122.4);
    myPropietario.setNumero_departamento("1812");
            System.out.println(myPropietario);

        System.out.println(myPropietario.getCuota_recibo());

        myPropietario.setPhonenumber("999123565");
        System.out.println(myPropietario.getPhonenumber());
        myPropietario.setDni("45454545");
        System.out.println(myPropietario.getDni());




    /*System.out.println(myPropietario.id_propietario + ". El nombre del propietario que vive en el departamento: "
                + myPropietario.numero_departamento + " del Condominio Terrazas del sol - Campoy es : " + myPropietario.nombre);
    System.out.println(myPropietarioA.id_propietario + ". El nombre del propietario que vive en el departamento: "
                + myPropietarioA.numero_departamento + " del Condominio Terrazas del sol - Campoy es : " + myPropietarioA.nombre);*/


        /*System.out.println(myPropietario.id_propietario + ". El nombre del propietario del Condominio Terrazas del sol - Campoy: " + myPropietario.nombre );
        System.out.println(myPropietario.id_propietario + ". El nombre del propietario del Condominio Terrazas del sol - Campoy: " + myPropietarioA.nombre );*/
    }
}
