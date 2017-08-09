package Array_Pra;

import java.util.Arrays;

public class Array_Pra {
    public static int[] reverse(int[] list) {
        int [] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a;
        a = reverse(new int[] {1, 3, 52, 362, 234});
        System.out.println(Arrays.toString(a));
    }
//    public static void printArray(int[] array){
//        for (int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        printArray(new int[] {1, 2, 3, 5, 6, 8});
//    }
}
