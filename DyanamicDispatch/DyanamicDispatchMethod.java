package DyanamicDispatch;
class Employee{
    void work(){
        System.out.println("Employee is Working..");
    }
}
class Developer extends Employee{
    @Override
    void work(){
        System.out.println("Developer is writing code..");
    }
}
class Tester extends Employee{
    @Override
    void work(){
        System.out.println("Tester is testing the application");
    }
}
public class DyanamicDispatchMethod {
    public static void main(String[] args) {
        Employee emp=new Tester();
        emp.work();

    }
}
