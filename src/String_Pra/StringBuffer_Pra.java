package String_Pra;

public class StringBuffer_Pra {
    public static void main(String[] args) {
        StringBuffer sBuffer = new StringBuffer("RUNOOB: ");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        StringBuilder sBuilder = new StringBuilder("FN:");
        sBuilder.append(" you");
        sBuilder.append(" silly");
        sBuilder.append(" B");
        System.out.println(sBuilder);
    }
}


//        String 长度大小不可变
//        StringBuffer 和 StringBuilder 长度可变
//        StringBuffer 线程安全 StringBuilder 线程不安全
//        StringBuilder 速度快