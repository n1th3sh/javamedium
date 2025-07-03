public class steppingnum {
    public static void main(String[] args) {
        int n=19345;
        while (n > 9) {
            int sub = 0;
            int a = n % 10;
            int sub1 = a;
            n /= 10;
            int b = n % 10;
            int sub2 = b;
            sub = (sub1 - sub2);
            if(sub==-1 || sub==1)
            {
                continue;
            }
            else{
                System.out.println("no");
                break;
            }
        }
        if(n<=9)
        {
            System.out.println("yes");
        }
    }
}
