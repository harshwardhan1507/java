package com.harshwardhan.fundamentals.projects.beginner;

import java.util.Scanner;
public class CompInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double p = sc.nextDouble();
        System.out.println("Enter the interest rate");
        double r = sc.nextDouble();
        System.out.println("Enter the number of compounded per year");
        int n = sc.nextInt();
        System.out.println("Enter the number of years");
        int t = sc.nextInt();
        double amt = p* Math.pow(1+ r/n, n*t);
        System.out.println("The amount is "+amt);
    }
}