package javakb.ch02_controlflow;

import java.util.Scanner;

class LogicalOperators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your price : ");
        int price = sc.nextInt();
        System.out.print("are you employee (true/flase) : ");
        boolean bool = sc.nextBoolean();
        if(price >= 2000 && bool == true){ // if they are employee and they have price greater than 2000 execute this
            System.out.println("you are eligible for discount of 20%");
        }
        else  if(price >= 2000 || bool == true ){ // if they are employee or prize greater than 2000 execute this
            System.out.println("you are eligible for discount of 10%");
        }
        else{ // if neither then  this
            System.out.println("you are eligible for discount of 0%");
        }
        sc.close();
    }
}