import java.util.Scanner;
public class password
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            String password = sc.nextLine();
            sc.close();

            if (password.length() >= 9 && password.length() <= 14 &&
                    password.matches(".*[A-Z].*") &&
                    password.matches(".*[a-z].*") &&
                    password.matches(".*\\d.*") &&
                    password.matches(".*[!@#$%^&*()_+={};':,.<>?/`~].*")) {
                System.out.println(password + " is a valid password");
            }
            else
            {
                System.out.println(password + " is an invalid password");
            }
        }
}


