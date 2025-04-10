public class Main {
    public static void main(String[] args) {
        ArbolBinarioDeBusquedaEnteros arbol = new ArbolBinarioDeBusquedaEnteros();

        for (int i = 0; i <= 128; i++) {
            arbol.add(i);
        }

        System.out.println("PreOrden: " + arbol.getListaPreOrden());
        System.out.println("PostOrden: " + arbol.getListaPostOrden());
        System.out.println("InOrden: " + arbol.getListaOrdenCentral());
        System.out.println("Altura: " + arbol.getAltura());
        System.out.println("Grado: " + arbol.getGrado());
        System.out.println("Suma: " + arbol.getSuma());
        System.out.println("Nivel 3: " + arbol.getListaDatosNivel(3));
        System.out.println("Camino al 50: " + arbol.getCamino(50));
        System.out.println("Homogeneo? " + arbol.isArbolHomogeneo());
        System.out.println("Completo? " + arbol.isArbolCompleto());
        System.out.println("CasiCompleto? " + arbol.isArbolCasiCompleto());
    }
}
