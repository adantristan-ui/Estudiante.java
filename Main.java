/**
 * Clase principal del programa
 */
public class Main {

    public static void main(String[] args) {

        // Instanciación de objetos
        Estudiante estudiante1 = new Estudiante(
                "Adan Tristan",
                "A12345",
                85,
                90,
                78
        );

        Estudiante estudiante2 = new Estudiante(
                "Maria Lopez",
                "B67890",
                60,
                65,
                70
        );

        // Uso de métodos
        estudiante1.mostrarInformacion();
        System.out.println("---------------------");
        estudiante2.mostrarInformacion();
    }
}

