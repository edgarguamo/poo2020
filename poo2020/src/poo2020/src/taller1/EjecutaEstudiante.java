package taller1;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Estudiante objEstudiante = new Estudiante();
        objEstudiante.actualizarNombre ("Edgar Guamo M");
        objEstudiante.actualizarEdad(23);
        objEstudiante.actualizarSexo("Masculino");
        objEstudiante.actualizarInstitucion("Utpl");


        String estudiar = objEstudiante.estudiar();
        String asistir = objEstudiante.asistir();
        System.out.printf(estudiar);
        System.out.println(asistir);
    }


}
