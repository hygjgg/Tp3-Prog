public class ListaEnlazada {
    protected Nodo primero;

    public ListaEnlazada() {
        this.primero = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void insertarPrimero(Object dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(primero);
        primero = nuevo;
    }

    public void insertarUltimo(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (estaVacia()) {
            primero = nuevo;
        } else {
            Nodo aux = primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public Object quitarPrimero() {
        if (estaVacia()) return null;
        Object dato = primero.getDato();
        primero = primero.getSiguiente();
        return dato;
    }

    public Object verPrimero() {
        return estaVacia() ? null : primero.getDato();
    }
}
