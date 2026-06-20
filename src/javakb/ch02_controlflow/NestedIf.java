package javakb.ch02_controlflow;

import java.util.Scanner;

class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // let say you have to check  condition in an existing condition use nested if
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        if (age <= 18) {
            if(age < 0){
                System.out.println("Invalid Age");
            }
            else{
                System.out.println("You are a child");
            }
        }
        else{
            System.out.println("you are an adult");
        }
        sc.close();
    }
}