public class AddTwoNumbers {
    public static void main(String[] args) {
        float num1 = (float) 1.8;   // The "(float)" "casts" the number as a single precision number
        float num2 = (float) 1.7;   // Without the cast, the Java compiler will interpret a number with a decimal point
                                    // as a double precision constant.
        System.out.println(num1 + num2); // would output 3.2
    }
}
