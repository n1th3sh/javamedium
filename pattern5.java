public class pattern5 {
    public static void main(String[] args) {
        for(char i='e';i>='a';i--){
            for(char j='e';j>='a';j--){
                if(i<j){
                    System.out.print(" ");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
