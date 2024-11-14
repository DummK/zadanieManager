abstract class Employee {
    abstract void calculateSalary();
    abstract void displayInfo();

    String department;
    double salary;
    int overtime;
    double hourlyRate;
    double bonus;
}

class Manager extends Employee {
    public Manager(String department, double salary, double hourlyRate, double bonus) {
        this.department = department;
        this.salary = salary;
        this.hourlyRate = hourlyRate;
        this.bonus = bonus;
    }

    public void calculateSalary() {
        double finalSalary = bonus + salary;
        System.out.println("This manager final salary is: " + finalSalary);
    }

    public void displayInfo() {
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
        System.out.println("Hourly rate : " + hourlyRate);
        System.out.println("Bonus : " + bonus);
    }
}

class Programmer extends Employee {
    public Programmer(String department, double salary, int overtime, double hourlyRate, double bonus) {
        this.department = department;
        this.salary = salary;
        this.overtime = overtime;
        this.hourlyRate = hourlyRate;
        this.bonus = bonus;
    }

    public void calculateSalary() {
        double finalSalary = overtime * hourlyRate + bonus + salary;
        System.out.println("This programmer final salary is: " + finalSalary);
    }

    public void displayInfo() {
        System.out.println("Department : " + department);
        System.out.println("Salary : " + salary);
        System.out.println("Overtime : " + overtime);
        System.out.println("Hourly rate : " + hourlyRate);
        System.out.println("Bonus : " + bonus);
    }
}

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Lewiatan", 10000, 11, 23.4, 120);
            programmer.displayInfo();
            programmer.calculateSalary();
        Manager manager = new Manager("Lewiatan", 200000, 70.4, 123421);
            manager.displayInfo();
            manager.calculateSalary();
    }
}