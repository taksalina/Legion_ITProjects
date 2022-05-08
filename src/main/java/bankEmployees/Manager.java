package bankEmployees;

public class Manager extends Employee{
    private static final String Manager = "Manager";
    public Manager(String name, int id,  String dateOfBirth, double salary, String address) {
        super(name, id, Manager, dateOfBirth, salary, address);
    }

    public void hireEmployee(){
        System.out.println("John Smith hire Amanda Kim on clerk position");

    }

    @Override
    public void receiveSalary() {
        super.receiveSalary();
    }
}
