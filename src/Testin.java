import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testin {
    public static void main(String[] args) {
        ArbolBinarioDeBusquedaEnteros arbol = new ArbolBinarioDeBusquedaEnteros();

        List<Integer> numeros = new ArrayList<>();

        // Añadimos del 0 al 128
        for (int i = 0; i <= 20; i++) {
            numeros.add(i);
        }

        // Desordenamos la lista
        Collections.shuffle(numeros);

        // Insertamos en el árbol
        for (int num : numeros) {
            arbol.add(num);
        }

        System.out.println("PreOrden: " + arbol.getListaPreOrden());
        System.out.println("PostOrden: " + arbol.getListaPostOrden());
        System.out.println("InOrden: " + arbol.getListaOrdenCentral());
    }
}
