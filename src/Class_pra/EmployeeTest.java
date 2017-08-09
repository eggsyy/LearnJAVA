package Class_pra;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("Bob");
        Employee empTwo = new Employee("Henry");

        empOne.empAge(34);
        empOne.empDesignation("High-level Program Designer");
        empOne.empSalary(100000);
        empOne.printEmployee();

        empTwo.empAge(20);
        empTwo.empDesignation("Noob Coder");
        empTwo.empSalary(1000);
        empTwo.printEmployee();
    }
}
