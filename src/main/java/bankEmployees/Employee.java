package bankEmployees;

public class Employee {
    String name;
    int id;
    String title;
    String dateOfBirth;
    double salary;
    String address;
    String currency = "USD";

    public Employee(String name, int id, String title, String dateOfBirth, double salary, String address){
        this.name = name;
        this.id = id;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void printDetails(){
        System.out.println("Name " + name);
        System.out.println("Title " + title);
        System.out.println("Employee ID " + id);
        System.out.println("Address " + address);
        System.out.println("Birth date " + dateOfBirth);
        System.out.println("Salary " + salary);
    }

    public void receiveSalary() {
        System.out.println("The departments of management, clerks and accountants departments receive a salary every two weeks.");
    }

}
