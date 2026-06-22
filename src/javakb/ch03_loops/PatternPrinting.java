package javakb.ch03_loops;

import java.util.Arrays;

/*
Patterns:

*
**
***             pattern 1
****
*****

*****
****
***             pattern 2
**
*


1
12
123             pattern 3
1234
12345

Pattern printing is where loop understanding becomes practical.
 */
class PatternPrinting {
    static void main(String[] args) {

        // pattern 1
        // we see that around principal diagonal (i==j) when the condition i >=j we print * and else we skip
        for(int i =0;i<5;i++){
            for(int j =0;j<5;j++){
                if(i>=j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
        // Pattern 2
        // Print '*' when i <= j, otherwise print a space.
        // The number of stars decreases by one in each row,
        // forming an inverted left-aligned right-angled triangle.
        for(int i = 0;i<5;i++){
            for(int j =4;j>=0;j--){
                if(i<=j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // pattern 3
        // similar approch as pattern 1 as for each row our j changes , so we print j
        for(int i =0;i<=5;i++){
            for(int j =1;j<=5;j++){
                if(i>=j){
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
