import java.util.Scanner;
public class vowels
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        int vowels=sentence.replaceAll("[^AEIOUaeiou]","").length();
        int consonants =sentence.replaceAll("[AEIOUaeiou]","").length();
        int words = sentence.split("\\s+").length;
        String reverse=new StringBuilder(sentence).reverse().toString();
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(words);
        System.out.println(reverse);


    }
}
