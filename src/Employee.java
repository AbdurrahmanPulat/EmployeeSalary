public class Employee {

    private String name;
    public double salary;
    private int workHours, hireYear;


    Employee(String name, double salary, int workHour, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHour;
        this.hireYear = hireYear;

    }

    public double tax() {
        if (this.salary >= 1000) {
            return salary * 0.03;
        }
        return 0.0;
    }


    public double bonus() {
        int extraHours = this.workHours - 40;
        if (extraHours > 0) {
            return 30 * extraHours;

        }
        return 0.0;
    }

    public double raiseSalary() {
        int year = 2021 - this.hireYear;
        if (year < 10) {
            return salary * 0.05;
        } else if (year > 9 && year < 20) {
            return salary * 0.10;

        } else {
            return salary * 0.15;
        }
    }

    public void toString(Employee emp) {
        System.out.println("Name: " + emp.name);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Hire year: " + emp.hireYear);
        System.out.println("Tax: " + emp.tax());
        System.out.println("Bonus: " + emp.bonus());
        System.out.println("Incrase salary: " + emp.raiseSalary());
        double totalSalary = emp.salary - emp.tax() + emp.bonus();
        System.out.println("Total salary with tax and bonus: " + totalSalary);
        System.out.println("Total salary with the raise of salary: " + (emp.salary + emp.raiseSalary()));
    }


}
