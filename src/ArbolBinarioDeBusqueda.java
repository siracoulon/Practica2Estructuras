import java.util.ArrayList;
import java.util.List;

public class ArbolBinarioDeBusqueda<T extends Comparable<T>> {

    // Clase interna Nodo (Persona 1)
    protected class Nodo {
        T dato;
        protected Nodo izquierda;
        protected Nodo derecha;

        Nodo(T dato) {
            this.dato = dato;
        }
    }

    protected Nodo raiz;  // Persona 1

    // ------------------ Persona 1 ------------------

    public void add(T dato) {
        raiz = addRecursivo(raiz, dato);
    }

    private Nodo addRecursivo(Nodo actual, T dato) {
        if (actual == null) {
            return new Nodo(dato);
        }

        if (dato.compareTo(actual.dato) < 0) {
            actual.izquierda = addRecursivo(actual.izquierda, dato);
        } else if (dato.compareTo(actual.dato) > 0) {
            actual.derecha = addRecursivo(actual.derecha, dato);
        }
        return actual;
    }

    public ArbolBinarioDeBusqueda<T> getSubArbolIzquierda() {
        ArbolBinarioDeBusqueda<T> subIzq = new ArbolBinarioDeBusqueda<>();
        subIzq.raiz = this.raiz != null ? this.raiz.izquierda : null;
        return subIzq;
    }

    public ArbolBinarioDeBusqueda<T> getSubArbolDerecha() {
        ArbolBinarioDeBusqueda<T> subDer = new ArbolBinarioDeBusqueda<>();
        subDer.raiz = this.raiz != null ? this.raiz.derecha : null;
        return subDer;
    }

    // ------------------ Persona 2 ------------------

    public List<T> getListaPreOrden() {
        List<T> lista = new ArrayList<>();
        preOrden(raiz, lista);
        return lista;
    }

    private void preOrden(Nodo nodo, List<T> lista) {
        if (nodo == null) return;

        lista.add(nodo.dato);                     // Raíz
        preOrden(nodo.izquierda, lista);          // Izquierda
        preOrden(nodo.derecha, lista);            // Derecha
    }

    public List<T> getListaPostOrden() {
        List<T> lista = new ArrayList<>();
        postOrden(raiz, lista);
        return lista;
    }

    private void postOrden(Nodo nodo, List<T> lista) {
        if (nodo == null) return;

        postOrden(nodo.izquierda, lista);         // Izquierda
        postOrden(nodo.derecha, lista);           // Derecha
        lista.add(nodo.dato);                     // Raíz
    }

    public List<T> getListaOrdenCentral() {
        List<T> lista = new ArrayList<>();
        ordenCentral(raiz, lista);
        return lista;
    }

    private void ordenCentral(Nodo nodo, List<T> lista) {
        if (nodo == null) return;

        ordenCentral(nodo.izquierda, lista);      // Izquierda
        lista.add(nodo.dato);                     // Raíz
        ordenCentral(nodo.derecha, lista);        // Derecha
    }

    // ------------------ Persona 3 ------------------

    public int getGrado() {
        return grado(raiz);
    }

    private int grado(Nodo nodo) {
        // completar
        return 0;
    }

    public int getAltura() {
        return altura(raiz);
    }

    private int altura(Nodo nodo) {
        // completar
        return 0;
    }

    public List<T> getListaDatosNivel(int nivel) {
        List<T> lista = new ArrayList<>();
        datosNivel(raiz, nivel, 0, lista);
        return lista;
    }

    private void datosNivel(Nodo nodo, int nivel, int actual, List<T> lista) {
        // completar
    }

    public List<T> getCamino(T dato) {
        List<T> lista = new ArrayList<>();
        camino(raiz, dato, lista);
        return lista;
    }

    private boolean camino(Nodo nodo, T dato, List<T> lista) {
        // completar
        return false;
    }

    // ------------------ Persona 4 ------------------

    public boolean isArbolHomogeneo() {
        // completar
        return false;
    }

    public boolean isArbolCompleto() {
        // completar
        return false;
    }

    public boolean isArbolCasiCompleto() {
        // completar
        return false;
    }

}
