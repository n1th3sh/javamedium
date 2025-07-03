import java.sql.SQLOutput;

public class palindromestr {
    public static void main(String[] args) {
        int a=976592;
        int sum=0;
        while(a>0){
            int b=a%10;
            sum+=b;
            a/=10;
            if(a==0){
                if(sum>9){
                    a=sum;
                    sum=0;
                }
            }
        }
        System.out.println(sum);
    }
}
