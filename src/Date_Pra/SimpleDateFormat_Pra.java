package Date_Pra;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_Pra {
    public static void main(String[] args) {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' HH:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));
    }
}
