package Scanner_Pra;

import java.util.Scanner;

public class Scanner_hasNextXXX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;

        System.out.println("Input an integer: ");
        if (scan.hasNextInt()) {
            i = scan.nextInt();
            System.out.println("Integer is : " + i);
        }else {
            System.out.println("It's not an integer!");
        }

        System.out.println("Input a float: ");
        if (scan.hasNextFloat()) {
            f = scan.nextFloat();
            System.out.println("float is : " + f);
        }else {
            System.out.println("It's not a float!");
        }
    }
}
