public class deleteelem {
    public static void main(String[] args) {
        int arr[]={10,20,60,40,30,50,40};
        int pos=3;
        int j=pos;
        for(int i=0;i<arr.length-1;i++){
            if(pos-1<=i){
                arr[i]=arr[j++];
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
