package Array_Pra;

public class MultidimensionalArray_Pra {
    public static void main(String[] args) {
        int [][] num = new int [3][3];
        num[0][0] = 1; //给第一行第一个元素赋值
        num[0][1] = 2; //给第一行第二个元素赋值
        num[0][2] = 3; //给第一行第三个元素赋值

        num[1][0] = 4; //给第二行第一个元素赋值
        num[1][1] = 5; //给第二行第二个元素赋值
        num[1][2] = 6; //给第二行第三个元素赋值

        num[2][0] = 7; //给第三行第一个元素赋值
        num[2][1] = 8; //给第三行第二个元素赋值
        num[2][2] = 9; //给第三行第三个元素赋值

        for (int x = 0; x < num.length; x++){
            for (int y = 0; y < num[x].length; y++){
                System.out.println(num[x][y]);
            }
        }
    }
}
