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

    private Nodo addRecursivo(Nodo nodo, T dato) {
        if (nodo == null) {
            return new Nodo(dato);  // Si el nodo es null, creamos un nuevo nodo con el dato
        }

        // Si el dato es menor, lo colocamos en el subárbol izquierdo
        if (dato.compareTo(nodo.dato) < 0) {
            nodo.izquierda = addRecursivo(nodo.izquierda, dato);
        }
        // Si el dato es mayor o igual, lo colocamos en el subárbol derecho
        else {
            nodo.derecha = addRecursivo(nodo.derecha, dato);
        }

        return nodo;  // Retornamos el nodo (ya actualizado)
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
        if(nodo != null){
            lista.add(nodo.dato);
            preOrden(nodo.izquierda, lista);
            preOrden(nodo.derecha, lista);
        }
    }

    public List<T> getListaPostOrden() {
        List<T> lista = new ArrayList<>();
        postOrden(raiz, lista);
        return lista;
    }

    private void postOrden(Nodo nodo, List<T> lista) {
        if (nodo != null) {
            postOrden(nodo.izquierda, lista);
            postOrden(nodo.derecha, lista);
            lista.add(nodo.dato);
        }
    }

    public List<T> getListaOrdenCentral() {
        List<T> lista = new ArrayList<>();
        ordenCentral(raiz, lista);
        return lista;
    }

    private void ordenCentral(Nodo nodo, List<T> lista) {
        if (nodo != null){
            ordenCentral(nodo.izquierda, lista);
            lista.add(nodo.dato);
            ordenCentral(nodo.derecha, lista);
        }
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
