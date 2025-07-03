public class distinctele {
    public static void main(String[] args) {
        int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};
        boolean seen[]=new boolean[100];
        for(int i=0;i<arr.length;i++){
            if(!seen[arr[i]]){
                seen[arr[i]]=true;
                System.out.print(arr[i]+" ");
            }
        }
    }
}
