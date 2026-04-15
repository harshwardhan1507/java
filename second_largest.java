import java.util.Scanner;
class SecondLargest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array: ");
        int len = sc.nextInt();
        double[] arr = new double[len];
        for(int i=0;i<len;i++)
        {
            System.out.println("Enter the " + i + " element: ");
            arr[i] = sc.nextDouble();
        }
        
        double max = arr[0];
        double secondMax = arr[1];
        
        if (secondMax > max) {
            double temp = max;
            max = secondMax;
            secondMax = temp;
        }
        
        for (int i = 2; i < len; i++)
        {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        
        System.out.println("Second largest element is: " + secondMax);
    }
}