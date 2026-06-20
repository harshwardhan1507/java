// for user input we import java.util package and use its Scanner class
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // you could use any valid name instead of sc , but i like using sc so i will stick with it
        System.out.println("user please input the following");
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        System.out.print("enter a decimal number : ");
        double y = sc.nextDouble();
        System.out.print("enter a boolean (true/false) : ");
        boolean bool =  sc.nextBoolean();
        System.out.print("enter a character : ");
        char ch = sc.next().charAt(0);
        sc.nextLine(); // cleaning the scanner so it can input the string
        System.out.print("enter a string : ");
        String str = sc.nextLine();

        System.out.println("here are the details entered");
        System.out.println("number is : " + x);
        System.out.println("decimal is : " + y);
        System.out.println("boolean  is : " + bool);
        System.out.println("character is : " + ch);
        System.out.println("string  is : " + str);
        sc.close(); // good practise to close scanner when its done
        // you should clean scanner using sc.nextLine() when inputting a string after number and vice versa
    }
}