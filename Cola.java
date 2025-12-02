public class Cola extends ListaEnlazada {

    public void encolar(Object dato) {
        insertarUltimo(dato);
    }

    public Object desencolar() {
        return quitarPrimero();
    }

    public Object frente() {
        return verPrimero();
    }
}
