package Sort_Practice;

//时间复杂度：最好：O(n)，最坏O(n^2)，平均O(n^2)  稳定

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5,3,6,2,1,9,4,8,7};
        System.out.println("排序前：");
        for (int num:a) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j< a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
             }
        }
        System.out.println();
        System.out.println("排序后：");
        for (int num:a) {
            System.out.print(num +" ");
        }
        System.out.println();
    }
}
