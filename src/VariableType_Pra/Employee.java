package VariableType_Pra;

public class Employee {
    public String name;
    private double salary;                  //实例变量
    private static double weight;
    public static final String DEPARTMENT = "Researcher";  //类变量

    public Employee (String empName){
        name = empName;
    }

    public void empAge(){
        int age = 0;                    //局部变量
        age = age + 27;
        System.out.println("The age of "+ name + " is:" + age);
    }

    public void setSalary(double empSal){
        salary = empSal;
    }

    public void printEmp(){
        System.out.println("name:" + name);
        System.out.println("salary:" + salary);
    }

    public static void main(String[] args) {
        weight = 100;
        Employee empOne = new Employee("Henry");
        empOne.setSalary(1000);
        empOne.printEmp();
        System.out.println(DEPARTMENT + "'s average weight is "+ weight);
        Employee employee = new Employee("Bob");
        employee.empAge();
    }
}
