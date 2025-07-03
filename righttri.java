public class righttri
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            System.out.println(" ".repeat(n-i)+"$".repeat(i));
        }
        for(int i=1;i<=n;i++)
        {
            System.out.println(" ".repeat(n-i) + "$".repeat(2*i-1));
        }
    }
}
