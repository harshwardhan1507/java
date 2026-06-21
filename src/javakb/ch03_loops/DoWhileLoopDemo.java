package javakb.ch03_loops;

class DoWhileLoopDemo{
    public static void main(String[] args){
        // do while execute atleast ones even if condition is false
        // syntax : do {code} while(condition)
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<10);
    }
}