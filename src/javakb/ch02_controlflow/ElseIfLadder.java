package javakb.ch02_controlflow;

import java.util.Scanner;

class ElseIfLadder {
    public static void main(String[] args) {
        // let say we have to check multiple conditions use ladder
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter number 2 : ");
        int num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("number are equal");
        } else if (num1>num2) {
            System.out.println("number 1 is greater than number 2");
        }
        else {
            System.out.println("number 2 is greater than number 1");
        }
        sc.close();
    }
}