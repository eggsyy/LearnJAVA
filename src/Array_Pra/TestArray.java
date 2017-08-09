package Array_Pra;

public class TestArray {
    public static void main(String[] args) {
        double[] myList = {5.5, 1.5, 4.6, 0.9, 6.3, 8.4, 1112, 99.99, 64.0};
        double sum = 0;
        double max = myList[0];

        for (int i = 0; i < myList.length; i++){
            System.out.print(myList[i] + " ");
        }
        System.out.println();
        System.out.println("Count is: " + myList.length);

        for (int j = 0; j < myList.length; j++) {
            sum += myList[j];
        }
        System.out.println("Sum is: " + sum);

        for (int i = 1; i < myList.length; i++){
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);
    }
}
