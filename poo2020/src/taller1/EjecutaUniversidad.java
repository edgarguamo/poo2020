package taller1;

public class EjecutaUniversidad {
    public static void main(String[] args) {
        Universidad objUniversidad = new Universidad();
        objUniversidad.actualizarNombre ("UTPL");
        objUniversidad.actualizarTipo("Privada");
        objUniversidad.actualizarnEstudainte("5510");
        objUniversidad.actualizarModalidad("Presencial");
        objUniversidad.actualizarTelefono("0952383135");

       objUniversidad.capacitar();
       objUniversidad.contratarDocentes();

    }


}
