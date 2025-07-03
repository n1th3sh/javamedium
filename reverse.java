public class reverse {
    public static void main(String[] args) {
        int num=341;
        int sum=0;
        while(num>0)
        {
            int a=num%10;
            sum=sum*10+a;
            num/=10;
        }
        System.out.println(sum);

    }
}
