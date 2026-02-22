# Estudiante.java
/**
 * Clase Estudiante
 * Representa a un estudiante con nombre, matrícula y calificaciones.
 */
public class Estudiante {

    // Atributos
    private String nombre;
    private String matricula;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;

    /**
     * Constructor de la clase Estudiante
     */
    public Estudiante(String nombre, String matricula, 
                       double calificacion1, double calificacion2, double calificacion3) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.calificacion1 = calificacion1;
        this.calificacion2 = calificacion2;
        this.calificacion3 = calificacion3;
    }

    /**
     * Método para calcular el promedio
     */
    public double calcularPromedio() {
        return (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    /**
     * Método para determinar si aprueba
     */
    public String verificarAprobacion() {
        if (calcularPromedio() >= 70) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }

    /**
     * Método para mostrar información del estudiante
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estatus: " + verificarAprobacion());
    }
}
