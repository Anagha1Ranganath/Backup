import java.util.*;
public class Main {
    public static void main(String args[])
    {
        //Integer number[]=new Integer(50);
        //Integer numrev[]=new Integer(50);

        System.out.println("Enter an integer");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int count=number.length;

        for(int i=1;i<=count;i++)
        {
            numrev[count-i]=number[i];
        }

        if(numrev==number)
        {
            System.out.println("Input is a palindrome");

            for(int i=1;i<=count;i++)
            {
                if(numrev[i]%2==0)
                {
                    int sum=0;
                    sum=sum+numrev[i];

                    if(sum>25)
                    {
                        System.out.println("The sum of even numbers is greater than 25");
                    }

                    else
                    {

                    }
                }
                else
                {

                }
            }
        }

        else
        {
             System.out.println("Input is not a palindrome");
        }



    }
}
