/*
Math.max(a,b,c,...) -> find maximum value
Math.min(a,b,c,...)-> find minimum value
Math.abs(a)-> gives the absolute value , works like modulus
Math.sqrt(a) -> return the square root
Math.pow(a,b) -> return a to the power of b
Math.round() -> round the number to whole number
Math.ceil() -> return the highest whole number of the float number
Math.floor() -> return the lowest whole number of the float number
Math.random() -> return a random number between 0 and 1 , return a decimal number
 */
class MathClassDemo{
    public static void main(String[] args) {
        int max = Math.max(4,78);
        System.out.println(" Max of (4,78) : " + max);

        int min = Math.min(4,78);
        System.out.println(" Min of (4,78) : " + min);

        int abs = Math.abs(-23);
        System.out.println(" abs 0f (-23) : " + abs);

        double sqrt = Math.sqrt(2); // returns double type
        System.out.println(" sqrt 2 (2) : " + sqrt);

        double power =  Math.pow(2,3); // returns double type
        System.out.println(" power of 2 (3) : " + power);

        double round = Math.round(3.14); // returns double type
        System.out.println(" round 4 (4.58) : " + round);

        double ceil =  Math.ceil(3.14); // returns double type
        System.out.println(" ceil  (3.14) : " + ceil);

        double floor =  Math.floor(4.78); // returns double type
        System.out.println(" floor  (4.78) : " + floor);

        double random =  Math.random(); // returns double type
        System.out.println(" random  (random) : " + random);

    }
}