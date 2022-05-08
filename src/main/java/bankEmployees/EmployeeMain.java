package bankEmployees;

public class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 1, "1981.01.19", 10000, "Richmond Hill");
        manager.printDetails();
        System.out.println();
        Clerk clerk1 = new Clerk("Maya Goldenberg", 2, "1991/11/29", 3000, "Aurora");
        clerk1.printDetails();
        System.out.println();
        Clerk clerk2 = new Clerk("Michael Ford", 3, "1987/09/21", 3000, "Aurora");
        clerk2.printDetails();
        System.out.println();
        Clerk clerk3 = new Clerk("Jane Morris", 4, "1979/10/11", 3000, "Toronto");
        clerk3.printDetails();
        System.out.println();
        Accountant accountant1 = new Accountant("Susan Mayer", 5, "1991/07/15", 6000, "Richmond Hill");
        accountant1.setSalary(5000);
        accountant1.printDetails();
        System.out.println();
        Accountant accountant2 = new Accountant("Svetlana Kiseleva", 6, "1967/12/09", 5000, "Mississauga");
        accountant2.printDetails();
        System.out.println();
        Accountant accountant3 = new Accountant("Chris Sawyer", 7, "1983/05/18", 5000, "Vaughan");
        accountant3.printDetails();
        System.out.println();
        Accountant accountant4 = new Accountant("Mila Sawyer", 8, "1986/07/30", 5000, "Vaughan");
        accountant4.printDetails();
        System.out.println();
        Accountant accountant5 = new Accountant("Boris Titov", 9, "1979/01/17", 5000, "Toronto");
        accountant5.printDetails();

        manager.hireEmployee();
        clerk1.callToCustomers();
        accountant1.calculateSalary();

    }


}
