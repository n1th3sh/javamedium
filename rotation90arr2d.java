public class rotation90arr2d {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int len=arr.length;

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<len;i++){
            int l=0;
            int r=len-1;
            while(l<r){
                int temp=arr[i][l];
                arr[i][l]=arr[i][r];
                arr[i][r]=temp;
                l++;
                r--;
            }
        }

        for(int a[]:arr){
            for(int x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
