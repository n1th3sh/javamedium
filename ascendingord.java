public class ascendingord {
    public static void main(String[] args) {
        int num=4576;
        while(num>0){
            int a=num%10;
            num/=10;
            int b=num%10;
            if(a>b){
                continue;
            }
            else{
                System.out.println("no");
                break;
            }
        }
        if(num<=0)
        {
            System.out.println("yes");
        }
    }
}
