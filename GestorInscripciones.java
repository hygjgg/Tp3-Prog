public class GestorInscripciones {
    private Cola solicitudesPendientes;

    public GestorInscripciones() {
        solicitudesPendientes = new Cola();
    }

    public void agregarSolicitud(SolicitudInscripcion s) {
        solicitudesPendientes.encolar(s);
    }

    public SolicitudInscripcion procesarSiguienteSolicitud() {
        return (SolicitudInscripcion) solicitudesPendientes.desencolar();
    }

    public SolicitudInscripcion verSiguienteSolicitud() {
        return (SolicitudInscripcion) solicitudesPendientes.frente();
    }

    public int cantidadSolicitudesPendientes() {
        return contarRec(solicitudesPendientes.primero);
    }

    private int contarRec(Nodo nodo) {
        if (nodo == null) return 0;
        return 1 + contarRec(nodo.getSiguiente());
    }
}
