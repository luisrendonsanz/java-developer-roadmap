package fundamentos;

public class MayorArray {
    public static void main(String[] args) {
        int [] arr = {2,9,4,5,7,12,5};
        System.out.println(mayorArray(arr));
    }
    public static int mayorArray(int [] arr){
        int numMayor = arr[0];
        for(int i=0; i<arr.length; i++){
            if(numMayor<arr[i]){
                numMayor=arr[i];
            }
        }
        return numMayor;
    }
}
