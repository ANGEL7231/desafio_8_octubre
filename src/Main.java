package src;

public class Main {
    public static void main(String[] args) {
        Par<String, Integer> p1 = new Par<>("Agua", 100);
        Par<String, Integer> p2 = new Par<>("Combustible", 500);
        Par<String, Integer> p3 = new Par<>("Oxigeno", 300);

        Caja<Integer> cajaCantidades = new Caja<>();
        cajaCantidades.agregar(p1.getValor());
        cajaCantidades.agregar(p2.getValor());
        cajaCantidades.agregar(p3.getValor());

        int mayorCantidad = cajaCantidades.obtenerMayor();

        Par<String, Integer>[] productos = new Par[]{p1, p2, p3};
        for (Par<String, Integer> p : productos) {
            if (p.getValor() == mayorCantidad) {
                System.out.println("Producto con mayor cantidad: " + p);
            }
        }
    }
}