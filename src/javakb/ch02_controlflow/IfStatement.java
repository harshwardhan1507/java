package javakb.ch02_controlflow;

class IfStatement{
    public static void main(String args[]){
        // if statement used when we have to check conditions
        int number1 = 17;
        int number2 = 32;

        if(number1==number2){
            System.out.println("Both are equal");
        }
        if(number1>number2){
            System.out.println("number1 is greater than number2");
        }
        if(number1<number2){
            System.out.println("number2 is greater than number1");
        }
    }
}