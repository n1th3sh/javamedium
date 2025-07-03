public class hsquare {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++)
            {
                for(char a='a';a<'z';a++)
                {
                    if(i==1 || j==1 || i==10 || j==10)
                    {
                        System.out.print(a);
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }


            }
            System.out.println();
        }
    }
}
