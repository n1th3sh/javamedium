public class inplaceTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int length=matrix.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int row[]:matrix){
            for(int x:row){
            System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
