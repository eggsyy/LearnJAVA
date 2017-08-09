package CycleStructure_Pra;

public class DoWhile_Pra {
    public static void main(String[] args) {
        int x = 10;
        do{
            if (x == 15) {
            continue;
            }
            System.out.println("value of x : " + x);
            x++;
        }while(x < 20);
    }
}
