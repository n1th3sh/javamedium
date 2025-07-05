public class boundaries2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12}
        };

        int row=arr.length;
        int col =arr[0].length;

        for(int i = 0; i< col; i++){
            System.out.print(arr[0][i]+" ");
        }
        for(int i=1;i<row;i++){
            System.out.print(arr[i][col-1]+" ");
        }
        for(int i=col-2;i>=0;i--){
            System.out.print(arr[row-1][i]+" ");
        }
        for(int i=row-2;i>0;i--){
            System.out.print(arr[i][0]+" ");
        }
    }
}
