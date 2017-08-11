package Sort_Practice;

// 时间复杂度：O(n^2)bu
public class SimpleSelectSort {
    private void selectSort(int[] a) {
        for (int i = 0;i < a.length; i++) {
            int k = i;
            for (int j = i + 1;j < a.length; j++) {
                if (a[k] > a[j])
                    k = j;
            }
            swap(a,k,i);
        }
    }
    public void swap(int[] data, int k, int i) {
//        int temp;
        if (k == i) {
            return;
        }
        data[k] = data[k] + data[i];
        data[i] = data[k] - data[i];
        data[k] = data[k] - data[i];
//        temp = data[i];
//        data[i] = data[k];
//        data[k] = temp;
    }

    public void print(int[] a) {
        for (int i = 0;i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6,10,8};
        SimpleSelectSort sss = new SimpleSelectSort();
        System.out.println("初始值：");
        sss.print(a);
        sss.selectSort(a);
        System.out.println("\n排序后：");
        sss.print(a);
    }
}
