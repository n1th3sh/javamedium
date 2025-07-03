public class commonarr {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 1};
        int b[] = {3, 1, 3, 4, 1};
        boolean seen[]=new boolean[b.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j] && !seen[j]){
                    System.out.print(b[j]+" ");
                    seen[j]=true;
                    break;
                }
            }
        }

    }
}
