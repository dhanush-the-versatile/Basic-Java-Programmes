/* Java program to implement Type Casting and Conversion. */
class TypeCastingConversion {
    public static void main(String[] args) {
        // Implicit Type Casting - Widening
        int a = 100;
        double doubleValue = a; // int to double
        System.out.println("Integer value: " + a);
        System.out.println("Converted to Double: " + doubleValue);

        // Explicit Type Casting - Narrowing
        double x = 99.99;
        int anotherIntValue = (int) x; // double to int
        System.out.println("Double value: " + x);
        System.out.println("Converted to Integer: " + anotherIntValue);
    }
}
