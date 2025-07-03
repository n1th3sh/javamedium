import java.util.Scanner;

import java.util.Scanner;
public class insertelem {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int pos=3;
        int ele=30;
        int j=size;
        for(int i=j;i>=0;i--){
            if(pos-1==i){
                arr[i]=ele;
            }else{
                arr[i]=arr[(j-1)];
                j--;
            }
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
