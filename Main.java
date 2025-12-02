import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

  
        Estudiante e1 = new Estudiante(1, "Franco");

        e1.agregarTarea(new Tarea("Leer capítulo 3", "Matemática", LocalDate.now().plusDays(2), 2));
        e1.agregarTarea(new Tarea("Resolver guía 5", "Programación", LocalDate.now().plusDays(1), 1));
        e1.agregarTarea(new Tarea("Hacer resumen", "Historia", LocalDate.now().plusDays(3), 3));

        System.out.println("\nTareas del estudiante:");
        e1.mostrarTareasRecursivo();

        System.out.println("\nPróxima tarea:");
        System.out.println(e1.verProximaTarea());

        System.out.println("\nCompletando última tarea...");
        System.out.println(e1.completarUltimaTarea());

        System.out.println("\nTareas restantes:");
        e1.mostrarTareasRecursivo();


        GestorInscripciones gestor = new GestorInscripciones();

        gestor.agregarSolicitud(new SolicitudInscripcion(e1, "Programación I"));
        gestor.agregarSolicitud(new SolicitudInscripcion(e1, "Estructuras de Datos"));

        System.out.println("\nSiguiente solicitud:");
        System.out.println(gestor.verSiguienteSolicitud());

        System.out.println("\nProcesando solicitud...");
        System.out.println(gestor.procesarSiguienteSolicitud());

        System.out.println("\nSolicitudes restantes: " + gestor.cantidadSolicitudesPendientes());
    }
}
