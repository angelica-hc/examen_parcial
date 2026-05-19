public class problema_02 {
    public static int[] nmayor(int[]arr, int i, int f) {
                if (i == f) {
            int[] aux = new int[2];
            aux[0] = arr[i];
            aux[1] = -1; 
            return aux;
        }
        int med=(i+f)/2;
        int[] izq = nmayor(arr, i, med);
        int[] der = nmayor(arr, med+1, f);
        int[] res = new int[2];
        if (izq[0] > der[0]) {
            res[0]=izq[0];
            if (izq[1]>der[0]){
                res[1]=izq[1];
            }else{
                res[1]=der[0];
            }
        }else{
            
        }

    }
    public static void main (String[]as){
        int [ ]salida={8,3,10,5,7};
        int r=nmayor(salida,0, salida.length-1);
        System.out.println("numero mayor es: "+r[1]);

    }
}