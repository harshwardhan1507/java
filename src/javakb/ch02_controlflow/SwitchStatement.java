package javakb.ch02_controlflow;

import java.util.Scanner;

class switchStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // used to make menu driven programs
        // an alternative of if-else-if ladder
        System.out.println("enter the number 1 to 5 ");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("enter number is 1");
                break;
            case 2:
                System.out.println("enter number is 2");
                break;
            case 3:
                System.out.println("enter number is 3");
                break;
            case 4:
                System.out.println("enter number is 4");
                break;
            case 5:
                System.out.println("enter number is 5");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();
    }
}