import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private String materia;
    private LocalDate fechaLimite;
    private int prioridad;

    public Tarea(String descripcion, String materia, LocalDate fechaLimite, int prioridad) {
        this.descripcion = descripcion;
        this.materia = materia;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return descripcion + " (" + materia + ") - límite: " + fechaLimite + " - prioridad: " + prioridad;
    }
}
