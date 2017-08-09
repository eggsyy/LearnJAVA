package Date_Pra;

import java.util.Date;

public class PrintfTime_Pra {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.printf("全部日期和时间信息: %tc%n", date);
        System.out.printf("年-月-日格式: %tF%n", date);
        System.out.printf("月/日/年格式: %tD%n", date);
        System.out.printf("HH:MM:SS PM格式（12小时制）: %tr%n", date);
        System.out.printf("HH:MM:SS格式（24小时制）: %tT%n", date);
        System.out.printf("HH:MM格式（24小时制）: %tR%n", date);
    }
}
