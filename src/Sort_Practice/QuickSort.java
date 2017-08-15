package Sort_Practice;


//平均时间复杂度：O(nlog2n) 最好: O(nlog2n)  最坏: O(n^2)   不稳定
public class QuickSort {
    private void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int middle = getMiddle(a, low, high);
            quickSort(a, 0, middle - 1);
            quickSort(a, middle + 1, high);
        }
    }

    public int getMiddle(int[] a, int low, int high) {
        int key = a[low];
        while (low < high) {
            while (low < high && a[high] >= key) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] <= key) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }

    public void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6,10,8};
        QuickSort quickSort = new QuickSort();
        System.out.println("初始值：");
        quickSort.print(a);
        int h = a.length - 1;
        quickSort.quickSort(a, 0 , h);
        System.out.println("\n排序后：");
        quickSort.print(a);
    }
}
