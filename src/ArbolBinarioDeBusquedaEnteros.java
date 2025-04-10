public class ArbolBinarioDeBusquedaEnteros extends ArbolBinarioDeBusqueda<Integer> {

    public int getSuma() {
        return sumaRecursiva();
    }

    private int sumaRecursiva() {
        return sumaNodo(super.getSubArbolIzquierda().raiz) +
                sumaNodo(super.getSubArbolDerecha().raiz) +
                (super.raiz != null ? super.raiz.dato : 0);
    }

    private int sumaNodo(Object nodoObj) {
        Nodo nodo = (Nodo) nodoObj;
        if (nodo == null) return 0;
        return sumaNodo(nodo.izquierda) + sumaNodo(nodo.derecha) + nodo.dato;
    }
}
