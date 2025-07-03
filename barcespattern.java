public class barcespattern {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            for(int j=1;j<=i;j++){
                for(int k=1;k<=j;k++){
                    System.out.print("{");
                }
                for(int l=1;l<=j;l++){
                    System.out.print("}");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
