package Extends_Pra;

public class SuperDemo {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.showMessage();
    }
}

class SuperClass {
    int i = 50;
}

class SubClass extends SuperClass {
    int i = 100;
    public void showMessage() {
        System.out.printf("super.i = %d, this.i = %d\n", super.i, this.i);
    }
}