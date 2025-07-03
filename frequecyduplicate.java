public class frequecyduplicate {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean seen[]=new boolean[100];
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(!seen[arr[i]]){
                for(int j=i+1;j< arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
                seen[arr[i]]=true;
            }
            if(count>1){
                System.out.println(arr[i]+"->"+count);
            }
        }
    }
}
