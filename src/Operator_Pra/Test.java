package Operator_Pra;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 30;
        String name = "James";
        boolean result = name instanceof String;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("a / b = " + (a / b) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("d++ = " + (d++) );
        System.out.println("now d = " + d);
        System.out.println("++d = " + (++d) );
        System.out.println("Is name a String ? " + result);
    }
}
