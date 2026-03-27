import java.util.*;
public class add
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        double a = sc.nextDouble();
        System.out.println("Enter number 2: ");
        double b = sc.nextDouble();

        double sum = a+b;
        System.out.println("Sum is : "+sum);
    }
}