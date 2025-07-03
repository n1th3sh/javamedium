public class altaddsum {
    public static void main(String[] args) {
        int n=10000;
        int opt=1;
        int sum=0;
        int sign=1;
        for(int i=n;i>0;i--){
            if(opt==2) {
                sign*=1;
                sum = sum+(sign*i);
                sign*=-1;
            }
            if(opt==1) {
                sign*=1;
                sum = sum+(sign*i);
                sign*=-1;
            }
        }
        System.out.println(sum);
    }
}
