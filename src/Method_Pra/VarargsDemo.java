package Method_Pra;

public class VarargsDemo {
    public static void printMax (double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }

    public static void main(String[] args) {
        printMax(1, 2, 4, 341.3, 23423.3, 252);
        printMax(new double[]{1, 123124, 3.345, 4});
    }
}
