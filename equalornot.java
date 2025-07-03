public class equalornot {
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 4, 0};
        int b[] = {2, 4, 5, 0, 9};
        boolean seen[]=new boolean[10];
        for(int i=0;i<a.length;i++){
            if(!seen[a[i]]){
                seen[a[i]]=true;
            }
        }
        for(int i=0;i<b.length;i++){
            if(!seen[b[i]]){
                System.out.print("False");
            }
        }

    }
}
