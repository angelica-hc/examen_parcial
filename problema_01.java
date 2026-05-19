public class problema_01{
public static boolean secue(int [] ar, int n){
if (n==ar.length-1){
    return true;
}
if(ar[n]>ar[n+1]){
    return false;
}
return secue(ar, n+1);
}

    public static void main(String[]as){
        int []arr1={1,2,3,4,5};
        int []arr2={1,4,2,8};
        System.out.print("ejemplo1: "+secue(arr1,0));
        System.out.print("\nejemplo2: "+secue(arr2,0));

    }
}