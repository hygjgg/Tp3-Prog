public class Pila extends ListaEnlazada {

    public void apilar(Object dato) {
        insertarPrimero(dato);
    }

    public Object desapilar() {
        return quitarPrimero();
    }

    public Object cima() {
        return verPrimero();
    }
}
