package javakb.ch02_controlflow;

import java.util.Scanner;

class IfElseStatement{
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // if else used when the if turns false the else part executes
        // condition has two execution paths
        System.out.print("Enter number 1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = sc.nextInt();
        if(number1>number2){
            System.out.println("number1 is greater than number2");
        }
        else{
            System.out.println("number2 is greater than number1");
        }
        sc.close();
    }
}