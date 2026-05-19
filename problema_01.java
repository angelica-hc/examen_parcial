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

    }
}