package Class_pra;

public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("The name of the dog is :" + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("The age of the dog is :" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Tommy");
        myPuppy.setAge(1);
        myPuppy.getAge();
        System.out.println("变量值 : " + myPuppy.puppyAge);
    }
}
