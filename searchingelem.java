public class searchingelem {
    public static void main(String[] args) {
        int a[]=new int[100];
        int arr[]={10,20,10,30,14,40,60,10};
        int Search=10;
        int incre=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            a[j]=arr[i];
            if(arr[i]==Search){
                j++;
                a[j]=++incre;
            }
            j++;
        }
        for(int x=0;x<j;x++){
            System.out.print(a[x]+" ");
        }
    }
}
