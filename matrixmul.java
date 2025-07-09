public class matrixmul {
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };
        int[][] B = {
                {5, 6},
                {7, 8}
        };
        int m= A.length;
        int n=A[0].length;
        int p=B[0].length;

        int res[][]=new int[m][p];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<p;k++){
                    res[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        for(int a[]:res){
            for(int x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
