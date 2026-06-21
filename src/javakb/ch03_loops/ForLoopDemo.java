package javakb.ch03_loops;

class ForLoopDemo{
    public static void main(String[] args){
        // used when we know the number of iteration of loops we want
        // syntax : for(initialization;condition;increment/decrement)
        for(int i = 0; i<=10;i++){
            System.out.println(i);
        }
        System.out.println("***************");
        for(int i = 1; i<=10; i*=2){
            System.out.println(i);
        }
    }
}