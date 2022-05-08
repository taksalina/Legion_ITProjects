package bankEmployees;

public class Clerk extends Employee {
    private static final String Clerk = "Clerk";

    public Clerk(String name, int id, String dateOfBirth, double salary, String address) {
        super(name, id, Clerk, dateOfBirth, salary, address);
    }

    public void callToCustomers() {
        System.out.println("Clerks Maya and Jane will call the company's clients and report on a new type of mortgage this week.");
        System.out.println("Clerk Jane answering the calls of the company's clients and advising them today.");
    }

    @Override
    public void receiveSalary() {
        super.receiveSalary();
    }
}
