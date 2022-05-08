package bankEmployees;

public class Accountant extends Employee {
    private static final String Accountant = "Accountant";

    public Accountant(String name, int id, String dateOfBirth, double salary, String address) {
        super(name, id, Accountant, dateOfBirth, salary, address);
    }

    public void calculateSalary() {
        System.out.println("Accountants Svetlana and Mila will calculate salaries for bank employees.");
    }

    @Override
    public void receiveSalary() {
        super.receiveSalary();
    }
}
