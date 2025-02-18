import java.util.Scanner;

public class lowupper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sen=sc.nextLine();
        String lower=sen.replaceAll("[A-Z]","");
        String upper=sen.replaceAll("[a-z]","");
        System.out.println(lower+upper);
    }
}
