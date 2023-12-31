public class Inicio {
    public static void main(String[] args) {
    Propietario myPropietario = new Propietario("Willy León", "1812");

    Propietario myPropietarioA = new Propietario("GianFranco Chirinos", "109");

    myPropietario.setCuota_recibo( 122.4);
        System.out.println(myPropietario.getNombre());
        System.out.println(myPropietario.getCuota_recibo());

        myPropietario.setPhonenumber("999123565");
        System.out.println(myPropietario.getPhonenumber());
        myPropietario.setDni("45454 545");
        System.out.println(myPropietario.getDni());



    /*System.out.println(myPropietario.id_propietario + ". El nombre del propietario que vive en el departamento: "
                + myPropietario.numero_departamento + " del Condominio Terrazas del sol - Campoy es : " + myPropietario.nombre);
    System.out.println(myPropietarioA.id_propietario + ". El nombre del propietario que vive en el departamento: "
                + myPropietarioA.numero_departamento + " del Condominio Terrazas del sol - Campoy es : " + myPropietarioA.nombre);*/


        /*System.out.println(myPropietario.id_propietario + ". El nombre del propietario del Condominio Terrazas del sol - Campoy: " + myPropietario.nombre );
        System.out.println(myPropietario.id_propietario + ". El nombre del propietario del Condominio Terrazas del sol - Campoy: " + myPropietarioA.nombre );*/
    }
}
