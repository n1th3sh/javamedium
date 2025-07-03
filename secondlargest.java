public class secondlargest {
    public static void main(String[] args) {
        int arr[]={19,36,27,84,93,3,5,43};
        int max=0;
        int sec=0;
        for(int x:arr){
            if(x>max){
                sec=max;
                max=x;
            }
        }
        System.out.println(sec);
    }
}
