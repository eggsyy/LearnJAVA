package Sort_Practice;

//插入排序  时间复杂度：O（n^2）,稳定的
public class InserSort {
    public void inserSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1]) {
                int j;
                int x = a[i];
                a[i] = a[i-1];
                for (j = i - 1; j >= 0 && x < a[j]; j--) {
                    a[j+1] = a[j];
                }
                a[j+1] = x;
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
        int a[] = {3,4,1,123,54,23,12,123};
        InserSort is = new InserSort();
        System.out.print("初始值：");
        is.print(a);
        is.inserSort(a);
        System.out.print("\n排序后: ");
        is.print(a);
    }
}
