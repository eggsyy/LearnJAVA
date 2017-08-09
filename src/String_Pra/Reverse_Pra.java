package String_Pra;

public class Reverse_Pra {
    public static void main(String[] args) {
        String s = "abcdefghi";
        reverse(s);
    }

    public static void reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
