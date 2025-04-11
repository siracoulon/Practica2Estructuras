public class Testin {
    public static void main(String[] args) {
        ArbolBinarioDeBusquedaEnteros arbol = new ArbolBinarioDeBusquedaEnteros();

        int[] numeros = {8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 7, 9, 11, 13, 15, 0};

        for(int num : numeros){
            arbol.add(num);
        }

        System.out.println("PreOrden: " + arbol.getListaPreOrden());
        System.out.println("PostOrden: " + arbol.getListaPostOrden());
        System.out.println("InOrden: " + arbol.getListaOrdenCentral());
    }
}
