package src;
public class Utilidades {

    public static <T> void intercambiar(T[] arr, int i, int j) {
        T temporal = arr[i];
        arr[i] = arr[j];
        arr[j] = temporal;
    }

    public static <T> int contar(T[] arr, T elemento) {
        int contador = 0;
        for (T item : arr) {
            if (item != null && item.equals(elemento)) {
                contador++;
            }
        }
        return contador;
    }

    public static <T extends Comparable<T>> T maximo(T[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}