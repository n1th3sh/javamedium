public class missingarray {
    public static void main(String[] args) {
        int arr[]={7,4,2,1,6,3};
        int sum=0;
        int len=arr.length+1;
        for(int x:arr){
            sum+=x;
        }
        System.out.println(len*(len+1)/2 - sum);
    }
}
