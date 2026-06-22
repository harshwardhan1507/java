package javakb.ch03_loops;

class NestedLoops {
    public static void main(String[] args) {
        // loop inside a loop
        // used in 2d arrays a lot and for matrix question and pattern printing
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i*j) + "  ");
            }
            System.out.println(" ");
            System.out.println(" ");
        }
    }
    // here i represent row
    // and j represents coloumn
}