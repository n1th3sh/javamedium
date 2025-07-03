import java.util.Scanner;
public class vowels
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sentences=sc.nextLine();
        String sentence=sentences.replaceAll(" ","");
        int vowels=sentence.replaceAll("[^AEIOUaeiou]","").length();
        int number=sentence.replaceAll("[^0-9]","").length();
        int consonants =sentence.replaceAll("[AEIOUaeiou + \\W +[0-9]]","").length();
        int special=sentence.replaceAll("\\w","").length();
        String reverse=new StringBuilder(sentence).reverse().toString();
        System.out.println("Vowels"+vowels);
        System.out.println("number"+number);
        System.out.println("consonants"+consonants);
        System.out.println("special"+special);
        System.out.println("reverse"+reverse);


    }
}
