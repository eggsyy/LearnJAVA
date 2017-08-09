package Method_Pra;

public class MaxMethod_Pra {
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else {
            result = num2;
        }
        return result;
    }

    //方法重载
    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static void main(String[] args) {
        double i = 1.234;
        double j = 2.46;
        double k;
        k = max(i, j);
        System.out.println(i + " compared with " + j + ", the bigger one is: " + k);
    }
}
