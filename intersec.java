public class intersec
{
    public static void main(String[] args)
    {
        String ip1="something";
        String ip2="else";
        for(int i=0;i<ip1.length();i++)
        {
            char c1=ip1.charAt(i);
            if(ip2.contains(c1+""))
            {
                continue;
            }
            else
            {
                System.out.print(c1);
            }

        }
        for(int i=0;i<ip2.length();i++)
        {
            char c2=ip2.charAt(i);
            if(ip1.contains(c2+""))
            {
                continue;
            }
            else
            {
                System.out.print(c2);
            }

        }

    }

}


