package Method_Pra;

public class PassByValue {
    public static void swap(int n1, int n2){
        System.out.println("进入swap方法");
        System.out.println("\t交换前num1的值为：" + n1 + ", num2的值：" + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\t交换后num1的值为：" + n1 + ", num2的值: " + n2);
    }
//It's a test
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("交换前num1的值为：" + num1 + ", num2的值为：" + num2);

        swap(num1, num2);
        System.out.println("交换后num1的值为：" + num1 + ", num2的值为：" + num2);
    }
}
