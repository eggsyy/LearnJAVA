package String_Pra;

public class String_Pra {
    public static void main(String[] args) {
        char [] helloArray = {'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String (helloArray);
        System.out.println(helloString);
        int len = helloString.length();
        System.out.println("len is " + len);
        System.out.println("the len of " + helloString + " is " + len);
    }
}
