import java.util.Scanner;

class ArithmeticOperations{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter number one : ");
        int a = sc.nextInt();
        System.out.print(" enter number two : ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println(" sum  a+b : " + sum);
        int difference = a-b;
        System.out.println(" difference a-b : " + difference);

        if (b != 0) { // remember to check if you are not dividing by zero or it will throw error
            System.out.println(a / b);
        }
        int remainder = a%b;
        System.out.println("remainder a%b : " + remainder);
        int multiplication = a*b;
        System.out.println("multiplication a*b : " + multiplication);
        System.out.println("Before increment: " + a);

        a++;

        System.out.println("After increment: " + a);
        int decrement = b--;
        System.out.println("decrement b--" + decrement);
    }
}