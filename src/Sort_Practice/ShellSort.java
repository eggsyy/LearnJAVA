package Sort_Practice;

//希尔排序，不稳定的排序方法
public class ShellSort {
    private void shellSort(int[] a) {
        int dk = a.length/2;
        while (dk >= 1) {
            ShellInserSort(a, dk);
            dk = dk / 2;
        }
    }

    private void ShellInserSort(int[] a, int dk) {
        for (int i = dk; i < a.length; i++) {
            if(a[i] < a[i - dk]) {
                int j;
                int x = a[i];
                a[i] = a[i - dk];
                for (j = i - dk; j >= 0 && x < a[j]; j = j -dk) {
                    a[j + dk] = a[j];
                }
                a[j + dk] = x;
            }
        }
    }

    public void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6,10,8};
        ShellSort ss = new ShellSort();
        System.out.println("初始值：");
        ss.print(a);
        ss.shellSort(a);
        System.out.println("\n排序后: ");
        ss.print(a);
    }
}
