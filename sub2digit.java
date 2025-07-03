public class sub2digit {
    public static void main(String[] args) {
        int n=6928;
        int mu=0;
            while (n > 9) {
                int sub = 0;
                int a = n % 10;
                int sub1 = a;
                n /= 10;
                int b = n % 10;
                int sub2 = b;
                sub = (sub1 - sub2);
                int subb = Math.abs(sub);
                mu = mu * 10 + subb;
                if(mu>99)
                {
                    n=mu;
                    mu=0;
                }
            }
        System.out.println(mu);
    }
}
