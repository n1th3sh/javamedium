public class coprime {
    public static void main(String[] args) {
        int n=120;
        for(int i=2;i<Math.sqrt(n);i++)
        {
            for(int j=2;j<120;j++)
            {
                if(i*j==n && !(i%2==0 && j%2==0))
                {
                    System.out.println(i+"*"+j);
                }
            }
        }
    }
}

