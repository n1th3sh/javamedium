public class matrixdiagonal {
    public static void main(String[] args) {
//;        int[][] arr = {
//                {1,  2,  3,  4},
//                {5,  6,  7,  8},
//                {9, 10, 11, 12},
//                {13,14, 15, 16}
//        };
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int primaryd=0;
        int secondary=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            primaryd+=arr[i][i];
            secondary+=arr[i][n-1-i];
        }
        System.out.println();
        int totalSum=primaryd+secondary;
        if (n % 2 == 1) {
            totalSum -= arr[n / 2][n / 2];
        }
        System.out.println("Primary Diagonal Sum: " + primaryd);
        System.out.println("Secondary Diagonal Sum: " + secondary);
        System.out.println("Total Diagonal Sum: " + totalSum);
    }
}
