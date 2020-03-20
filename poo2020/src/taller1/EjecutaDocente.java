package taller1;

public class EjecutaDocente {
    public static void main(String[] args) {
        Docente objDocente = new Docente();
        objDocente.actualizarNombre ("Pipo Gambino");
        objDocente.actualizarEdad(40);
        objDocente.actualizarSexo("Masculino");
        objDocente.actualizarEstadoCivil();
        objDocente.actualizarInstitucion("Unidad Educativa San Francisco de Asís");


        String enseniar = objDocente.enseniar();
        String calificar = objDocente.calificar();
        System.out.printf(enseniar);
        System.out.println(calificar);
    }


}
