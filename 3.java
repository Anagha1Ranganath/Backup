import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        String text;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the text");
        text = input.nextLine();
        for (int index = 0; index < text.length(); index++)
        {
            char letters = text.charAt(index);
            if (letters == 'a' || letters == 'e' || letters == 'i' || letters == 'o' || letters == 'u')
            {
                System.out.println(letters + " is a vowel");
            }
            else
            {
                System.out.println(letters + " is a consonant");
            }
        }

    }
}