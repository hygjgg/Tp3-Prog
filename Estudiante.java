public class Estudiante {
    private int id;
    private String nombre;
    private Pila tareasPendientes;

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.tareasPendientes = new Pila();
    }

    public void agregarTarea(Tarea t) {
        tareasPendientes.apilar(t);
    }

    public Tarea completarUltimaTarea() {
        return (Tarea) tareasPendientes.desapilar();
    }

    public Tarea verProximaTarea() {
        return (Tarea) tareasPendientes.cima();
    }

    public void mostrarTareasRecursivo() {
        mostrarRec(tareasPendientes.primero);
    }

    private void mostrarRec(Nodo nodo) {
        if (nodo == null) return;
        System.out.println("• " + nodo.getDato());
        mostrarRec(nodo.getSiguiente());
    }

    @Override
    public String toString() {
        return nombre + " (ID " + id + ")";
    }
}
