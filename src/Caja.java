package src;

public class Caja<T extends Comparable<T>> {
    private Object[] elementos = new Object[4];
    private int cantidad = 0;

    public void agregar(T elemento) {
        if (cantidad >= elementos.length) {
            throw new IllegalStateException("La caja esta llena");
        }
        elementos[cantidad] = elemento;
        cantidad++;
    }

    @SuppressWarnings("unchecked")
    public T obtenerMayor() {
        if (cantidad == 0) {
            throw new IllegalStateException("La caja esta vacia");
        }
        T mayor = (T) elementos[0];
        for (int i = 1; i < cantidad; i++) {
            T actual = (T) elementos[i];
            if (actual.compareTo(mayor) > 0) {
                mayor = actual;
            }
        }
        return mayor;
    }

    @SuppressWarnings("unchecked")
    public T obtenerMenor() {
        if (cantidad == 0) {
            throw new IllegalStateException("La caja esta vacia");
        }
        T menor = (T) elementos[0];
        for (int i = 1; i < cantidad; i++) {
            T actual = (T) elementos[i];
            if (actual.compareTo(menor) < 0) {
                menor = actual;
            }
        }
        return menor;
    }
}