package BranchingStructure_Pra;

public class Switch_Pra {
    public static void main(String[] args) {
        char grade = 'G';

        switch (grade){
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("good");
                break;
            case 'D':
                System.out.println("normal");
            case 'F':
                System.out.println("You need to work harder");
                break;
            default:
                System.out.println("Unknown");
        }
        System.out.println("Your level is : " + grade);
    }
}
