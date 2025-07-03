public class logduplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,4,2,5,6,1,3,4,2};
        int max=0;
        int dis=0;
        int element=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    dis=j-i;
                    if(max<dis){
                        max=dis;
                        element=arr[i];
                    }
                }
            }
        }
        System.out.println(element);
    }
}
