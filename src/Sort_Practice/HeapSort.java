package Sort_Practice;

//堆排序是不稳定的排序方法，辅助空间为O(1)， 最坏时间复杂度为O(nlog2n)
// 堆排序的堆序的平均性能较接近于最坏性能

public class HeapSort {
    public static void createMaxHeap(int[] a, int lastIndex) {
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            int fatherIndex = i;
            while (2 * fatherIndex + 1 <= lastIndex) {
                int biggerIndex = 2 * fatherIndex + 1;
                if (biggerIndex < lastIndex) {
                    if (a[biggerIndex] < a[biggerIndex + 1]) {
                        biggerIndex++;
                    }
                }
                if (a[fatherIndex] < a[biggerIndex]) {
                    swap(a, fatherIndex, biggerIndex);
                    fatherIndex = biggerIndex;
                } else {
                    break;
                }
            }
        }
    }
    public static void swap(int[] a, int f, int b) {
        int temp;
        if (f == b) {
            return;
        }
        temp = a[b];
        a[b] = a[f];
        a[f] = temp;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void heapSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            createMaxHeap(a, a.length - 1 - i);
            swap(a, 0, a.length - 1 - i);
            print(a);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,3,6,1,2,9,4,8,7};
        print(a);
        heapSort(a);
        System.out.println("排序后：");
        print(a);
    }
}
