package VariableType_Pra;

public class Test {
    public void pupAge(){
        int age = 0;                    //局部变量
        age = age + 7;
        System.out.println("The age of this dog is :" + age);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.pupAge();
    }
}
