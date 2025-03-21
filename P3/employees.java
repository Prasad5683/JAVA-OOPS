// Base class Employee
class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    // Constructor
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    // Method to calculate bonus
    public double calculateBonus() {
        return salary * 0.10;  // 10% bonus for all employees
    }

    // Method to generate performance report
    public void generatePerformanceReport() {
        System.out.println("Performance Report for " + name + ": Excellent");
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}

// Subclass Manager
class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    // Override bonus calculation for manager
    @Override
    public double calculateBonus() {
        return salary * 0.20;  // 20% bonus for managers
    }

    // Method to manage projects
    public void manageProject() {
        System.out.println("Managing projects for the team.");
    }
}

// Subclass Developer
class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    // Override bonus calculation for developer
    @Override
    public double calculateBonus() {
        return salary * 0.15;  // 15% bonus for developers
    }
}

// Subclass Programmer
class Programmer extends Developer {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary);
    }

    // Method to write code
    public void writeCode() {
        System.out.println("Writing code for the project.");
    }
}

public class employees {
    public static void main(String[] args) {
        Manager manager = new Manager("Prasad", "PANDHARPUR", 80000);
        Developer developer = new Developer("Sahil", "KOP", 60000);
        Programmer programmer = new Programmer("Sumit", "KOP", 50000);

        manager.displayDetails();
        System.out.println("Bonus: " + manager.calculateBonus());
        manager.generatePerformanceReport();
        manager.manageProject();

        developer.displayDetails();
        System.out.println("Bonus: " + developer.calculateBonus());
        developer.generatePerformanceReport();

        programmer.displayDetails();
        System.out.println("Bonus: " + programmer.calculateBonus());
        programmer.writeCode();
    }
}