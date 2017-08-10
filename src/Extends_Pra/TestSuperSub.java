package Extends_Pra;

class SuperClass1 {
    private int n;
    SuperClass1() {
        System.out.println("SuperClass()");
    }
    SuperClass1(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}

class SubClass1 extends SuperClass1 {
    private  int n;

    SubClass1() {
        super(5);
        System.out.println("SubClass");
    }

    public SubClass1(int n) {
        System.out.println("SubClass(int n):" + n);
        this.n = n;
    }
}
public class TestSuperSub {
    public static void main(String[] args) {
        SubClass1 sc = new SubClass1();
        SubClass1 sc1 = new SubClass1(200);
    }
}
