package CycleStructure_Pra;

public class StrongFor_Pra {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30, 40, 50};
        String [] names = {"James", "Henry", "Eggsy", "Bob"};

        for (int x : numbers){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        for (String name : names){
            System.out.print(name);
            System.out.print(",");
        }
    }
}
