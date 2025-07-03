public class grouprev {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 25, 35, 45 };
        int d=2;
        int len=a.length-1;
        for(int i=0;i<a.length;i++){
            if(d<0){
                System.out.print(a[len--]+" ");
            }else{
                System.out.print(a[d--]+" ");
            }
        }
    }
}
