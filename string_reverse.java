import java.util.Scanner;
public class string_reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String a = sc.nextLine();
        String rev;
        char[] rev_ = new char[a.length()];
        char[] arr = a.toCharArray();
        for(int i=0;i<=a.length()-1;i++)
        {
            rev_[i] = arr[a.length()-i-1];  
        }
        rev = new String(rev_);
        System.out.println("Reverse array is : "+ rev);
    }
}