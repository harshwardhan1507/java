public class VariablesAndDataTypes {
    public static void main(String[] args) {
        // Data types
      int num = 3;
      float numerical =  3.3f;
      double numerical2 = 3.1456937363;
      long numerical3 = 1234567890;
      boolean bool = true;  // only true or false
      char c = 'a';
      String str = "Hello World";

        System.out.println(num);
        System.out.println(numerical);
        System.out.println(numerical2);
        System.out.println(numerical3);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(str);

      // Variables
      int x = 3;
      System.out.println(" x is " + x);
      x = 5;
      System.out.println(" x is " + x); // value changed

        final double PI = 3.14; // use final to make it constant
        System.out.println(PI);
        // PI = 4.12 will throw error as it can't be changed

    }
}