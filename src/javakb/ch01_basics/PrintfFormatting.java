package javakb.ch01_basics;

class PrintfFormatting{
    public static void main(String[] args){
        String name = "Harsh";
        int age = 20;
        double cgpa = 8.95;
        char grade = 'A';
        boolean student = true;

        System.out.println("=== Regular Printing ===");
        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);

        System.out.println("\n=== Formatted Printing ===");

        System.out.printf("Name    : %s%n", name);
        System.out.printf("Age     : %d%n", age);
        System.out.printf("CGPA    : %.2f%n", cgpa);
        System.out.printf("Grade   : %c%n", grade);
        System.out.printf("Student : %b%n", student);

        System.out.println("\n=== Width Formatting ===");

        System.out.printf("|%-15s|%n", name);
        System.out.printf("|%-15d|%n", age);

        System.out.println("\n=== Decimal Precision ===");

        double pi = 3.1415926535;

        System.out.printf("Default value : %f%n", pi);
        System.out.printf("2 decimal     : %.2f%n", pi);
        System.out.printf("4 decimal     : %.4f%n", pi);

        System.out.println("\n=== Multiple Values ===");

        System.out.printf(
                "%s is %d years old and has a CGPA of %.2f%n",
                name,
                age,
                cgpa
        );
    }
}