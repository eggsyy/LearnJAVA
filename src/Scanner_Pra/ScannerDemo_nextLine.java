package Scanner_Pra;

import java.util.Scanner;

public class ScannerDemo_nextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nextLine receive: ");

        if (scan.hasNextLine()) {
            String str = scan.nextLine();
            System.out.println("Output : " + str);
        }
    }
}
