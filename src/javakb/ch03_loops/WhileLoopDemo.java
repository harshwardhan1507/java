package javakb.ch03_loops;

class WhileLoopDemo{
    public static void main(String[] args) {
        // used when you want to repeat code until a condition is met
        // syntax : while(condition){}
        int counter = 0;
        while(counter < 10){
            System.out.println(counter);
            counter++;
        }
        /*
        all loops have a loop control variable mainly [i,k,...] or any valid variable name in java
        a condition
        and a increment or decrement or any other operation on loop control variable
         */
    }
}