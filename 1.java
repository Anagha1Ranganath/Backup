import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        int number;

        System.out.println("Enter an integer");
        Scanner input = new Scanner(System.in);
        number=input.nextInt();

        if((number%2==0) && (number>=20) && (number<=30))
        {
            System.out.println("Tom");
        }

        else if((number%2==1) && (number>=20) && (number<=30))
        {
            System.out.println("Jerry");
        }

        else
        {

        }

    }
}
