import java.util.Arrays;

public class smalllarge {
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 2, 8, 7, 4};
        Arrays.sort(arr);
        int j=arr.length;
        int k=0;
        int smlr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                smlr[i]=arr[--j];
            }else {
                smlr[i] = arr[k++];
            }
        }
        for(int x:smlr){
            System.out.print(x);
        }
    }
}
