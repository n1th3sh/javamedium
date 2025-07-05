public class findsortedarr {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100,110,120}
        };
        int key=90;
        int row=0;
        boolean finded=false;
        int col=arr.length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.print(row+" "+col);
                finded=true;
                break;
            }
            else if(arr[row][col]<key){
                row++;
            }else{
                col--;
            }

        }
    }

}
