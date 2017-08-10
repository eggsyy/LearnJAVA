package Scanner_Pra;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("next方式接收:");

        if (scan.hasNext()) {
            String str = scan.next();
            System.out.println("输入的数据为: " + str);
        }
    }
}
