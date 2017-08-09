package CycleStructure_Pra;

public class While_Pra {
    public static void main(String[] args) {
        int x = 10;
        while (x < 20){
            if (x == 15){
                break;
            }
            System.out.println("value of x : " + x);
            x++;
        }
    }
}
