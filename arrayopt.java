import java.util.*;
public class arrayopt
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
                int high=0;
                for(int i=0;i<n;i++)
                {
                    if(arr[i]>high)
                    {
                        high=arr[i];
                    }
                }
                System.out.println(high);
                break;

            case 2:
                int low=arr[0];
                for(int i=0;i<n;i++)
                {
                    if(arr[i]<low)
                    {
                        low=arr[i];
                    }
                }
                System.out.println(low);
                break;

            case 3:
                int sum=0;
                for(int i=0;i<n;i++)
                {
                    sum+=arr[i];
                }
                System.out.println(sum);
                break;

            case 4:
                int avg =0;
                for(int i=0;i<n;i++)
                {
                    avg +=arr[i];
                }
                double avgg=avg/2;
                System.out.println(avgg);
                break;

            default:
                System.out.println("invalid");
        }

    }
}
