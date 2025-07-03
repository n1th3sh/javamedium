import java.util.Scanner;

public class flames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input names
        System.out.println("Enter boy name:");
        String boy = sc.nextLine().toLowerCase().replaceAll("\\s+", "");
        System.out.println("Enter girl name:");
        String girl = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        sc.close();

        // Convert names to character arrays for counting common letters
        StringBuilder boyName = new StringBuilder(boy);
        StringBuilder girlName = new StringBuilder(girl);

        int commonCount = 0;

        // Count and remove common letters
        for (int i = 0; i < boyName.length(); i++) {
            char c = boyName.charAt(i);
            int index = girlName.indexOf(String.valueOf(c));
            if (index != -1) {
                commonCount++;
                boyName.deleteCharAt(i);
                girlName.deleteCharAt(index);
                i--; // Adjust index after deletion
            }
        }

        // Remaining letters count
        int num = (boyName.length() + girlName.length());

        // FLAMES logic
        String flames = "FLAMES";
        String[] meanings = { "Friends", "Love", "Affection", "Marriage", "Enemies", "Siblings" };
        StringBuilder flamesSb = new StringBuilder(flames);
        int index = 0;

        while (flamesSb.length() > 1) {
            index = (index + num - 1) % flamesSb.length();
            flamesSb.deleteCharAt(index);
        }

        char finalChar = flamesSb.charAt(0);
        System.out.println(boy + " & " + girl + " are " + meanings["FLAMES".indexOf(finalChar)]);
    }
}
