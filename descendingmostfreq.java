import java.util.Arrays;

public class descendingmostfreq {
    public static void main(String[] args) {
        int arr[]={40,20,10,50,20,10,30,40};
        int n=arr.length;
        boolean count[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(count[i]){
                continue;
            }

            int c=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                    count[j]=true;
                }
            }
            System.out.println(arr[i]+"->"+c);
        }
    }
}
