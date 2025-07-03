public class Array2d {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6,},{7,8,9}};
        System.out.println("Matrix Array:row");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix Array:col");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix Array:transpose");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
