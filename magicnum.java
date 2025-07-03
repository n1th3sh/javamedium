import java.util.*;
public class magicnum {

    public static void main(String[] args) {

       int[] arr={1,2,3,4,0};
       int sum=1;
       boolean flag=false;
       for(int a:arr){
           if(a==0){
               flag=true;
           }else{
               sum*=a;
           }

       }
        System.out.println(sum);
       if(flag){
           int res[]=new int[5];
           for(int i=0;i<5;i++){
               if(arr[i]==0){
                   res[i]=sum;
               }
               else {
                   res[i] = 0;
               }
           }
           for(int a:res){
               System.out.print(a);
           }
       }
       else{
           int res[]=new int[5];
           for(int i=0;i<5;i++){
               res[i]=sum/arr[i];
           }
           for(int a:res){
               System.out.print(a);
           }
       }


    }
}
