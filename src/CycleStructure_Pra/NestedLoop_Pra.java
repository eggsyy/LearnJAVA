package CycleStructure_Pra;

public class NestedLoop_Pra {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println();
        }
//        for (int i = 1; i <= 3; i++){
//            for (int j = 1; j <= 3; j++){
//                System.out.println("i = " + i + ", j = " + j);
//            }
//        }
    }
}
