public class revarray {
    public static void main(String[] args) {
        int arr[]={2,4,1,5,3,9};
        int rev[]=new int[100];
        int reverse=arr.length;
        for(int i=0;i<arr.length;i++){
            rev[i]=arr[--reverse];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(rev[i]+" ");
        }
    }
}
