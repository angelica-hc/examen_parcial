public class problema_03 {
    public static int continv(int[] arr, int in, int f) {
        int conteo = 0;
        if (in < f) {
            int medio = (in + f) / 2;
            conteo += continv(arr, in   , medio);
            conteo += continv(arr, medio + 1, f);
            conteo += contm(arr, in , medio, f);
        }
        return conteo;
    }
    private static int contm(int[] arr, int in2, int medio, int fin) {
        int[] izq = new int[medio - in2 + 1];
        int[] der = new int[fin - medio];
        for (int i = 0; i < izq.length; i++) izq[i] = arr[in2 + i];
        for (int j = 0; j < der.length; j++) der[j] = arr[medio + 1 + j];
        int i = 0, j = 0, k = in2, inversiones = 0;
        while (i < izq.length && j < der.length) {
            if (izq[i] <= der[j]) {
                arr[k++] = izq[i++];
            } else {
                arr[k++] = der[j++];
                inversiones += (izq.length - i); 
            }
        }
        while (i < izq.length) arr[k++] = izq[i++];
        while (j < der.length) arr[k++] = der[j++];
        return inversiones;
    }
    public static void main(String[] args) {
        int[] ej = {3, 1, 2}; 
        System.out.println("inversiones: " + continv(ej, 0, ej.length - 1)); 
    }
}