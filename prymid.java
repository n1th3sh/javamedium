public class prymid {
    public static void main(String[] args) {
        int a=5;
        for(int i=a;i>=0;i--)
        {
            for(int j=0;j<=a;j++)
            {
                if(j>=i)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<=a;j++)
            {

                if(i==0)
                {
                    break;
                }
                else
                {
                    if(j>=i)
                    {
                        System.out.print(j);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            if(i==0)
            {
                continue;
            }
            else
            {
                System.out.println();
            }
        }
    }
}
