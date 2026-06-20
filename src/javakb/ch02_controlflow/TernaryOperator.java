package javakb.ch02_controlflow;

import java.util.Scanner;

class TernaryOperator{
    public static void main(String[] args) {
        // ternary can be used for replace if statement
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age : ");
        int age = sc.nextInt();
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);
        sc.close();
    }
}