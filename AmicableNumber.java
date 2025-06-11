import java.util.Scanner;
public class AmicableNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number= ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int sumA = 0, sumB = 0;
        for (int i = 1; i < a; i++)
        {
            if (a % i == 0)
            {
                sumA += i;
            }
        }
        for (int i = 1; i < b; i++)
        {
            if (b % i == 0)
            {
                sumB += i;
            }
        }
        if (sumA == b && sumB == a)
        {
            System.out.println("The numbers are Amicable Number.");
        }
        else
        {
            System.out.println("The numbers are not Amicable Number");
        }
    }
}
