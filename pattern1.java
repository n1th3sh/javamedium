public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n){
                    System.out.print("1 ");
                }
                if(i>1 && i<n){
                    if(j==1){
                        System.out.print(i);
                    }
                    else {
                        System.out.print(" ");
                    }
                    if(j==n){
                        System.out.print(n);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }
}
