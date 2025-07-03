import com.sun.jdi.IntegerValue;

public class removeduplicate {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5,6,6};
        int j=0;
        boolean seen[]=new boolean[10];
        for(int i=0;i<arr.length;i++){
            if(!seen[arr[i]]){
                seen[arr[i]]=true;
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i]);
        }
    }
}
