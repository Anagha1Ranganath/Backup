import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        int n, sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=input.nextInt();
        int number[] = new int[n];

        System.out.println("Enter the elements of the array");

        for(int i=0;i<n;i++)
        {
            number[i]=input.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            sum=sum+number[i];
        }

        System.out.println("Sum of the array is " + sum);
    }
}
