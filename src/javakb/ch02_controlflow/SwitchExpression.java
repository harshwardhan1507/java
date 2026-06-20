package javakb.ch02_controlflow;

import java.util.Scanner;

class SwitchStatement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the # of the day : ");
        int day=sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Welcome to the Monday");
            case 2 -> System.out.println("Welcome to the Tuesday");
            case 3 -> System.out.println("Welcome to the Wednesday");
            case 4 -> System.out.println("Welcome to the Thursday");
            case 5 -> System.out.println("Welcome to the Friday");
            case 6 -> System.out.println("Welcome to the Saturday");
            case 7 -> System.out.println("Welcome to the Sunday");
            default -> System.out.println("Invalid Day");
        }
        sc.close();
    }
}