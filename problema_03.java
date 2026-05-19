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
    }    public static void main(String[] args) {
        int[] ej = {3, 1, 2}; 
        System.out.println("inversiones: " + continv(ej, 0, ej.length - 1)); 
    }
