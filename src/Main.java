package src;

public class Main {
    public static void main(String[] args) {
        Boveda<String, Integer> p1 = new Boveda<>("Agua", 100);
        Boveda<String, Integer> p2 = new Boveda<>("Combustible", 500);
        Boveda<String, Integer> p3 = new Boveda<>("Oxigeno", 300);

        BovedaArreglo<Integer> cajaCantidades = new BovedaArreglo<>();
        BovedaArregloCantidades.agregar(p1.getValor());
        BovedaArregloCantidades.agregar(p2.getValor());
        BovedaArregloCantidades.agregar(p3.getValor());

        int mayorCantidad = BovedaArregloCantidades.obtenerMayor();

        Boveda<String, Integer>[] productos = new Boveda[]{p1, p2, p3};
        for (Boveda<String, Integer> p : productos) {
            if (p.getValor() == mayorCantidad) {
                System.out.println("Producto con mayor cantidad: " + p);
            }
        }
    }
}
