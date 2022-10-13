# EmployeeSalary

# About The Project
I wrote a class called "Employee" with the Java programming language. This class has 4 properties and 5 methods. Then I calculated the employee's name, salary, working hours, starting year, tax, bonus, salary increase, tax and bonuses, salary, total salary values ​​and printed them on the console.

## Video


https://user-images.githubusercontent.com/57863133/195567193-1b318d9e-9947-4a65-92ee-991c0ab0b0d5.mp4

# How the Project Works
 To run the project, java must be installed on your computer. In addition, one of the ide like Eclipse or Intellij Idea must be installed.
 Then you can install and run the project on your computer by typing git clone https://github.com/AbdurrahmanPulat/EmployeeSalary.git in the terminal.
  * [About The Project](#About-The-Project)
  * [Video](#Video)
  * [How the Project Works](#How-The-Project-Works)
  * [Employeee Class](#Employee-Class)
  * [Main Class](#Main-Class)
  

## Project Details
- Employee(name,salary,workHours,hireYear) : It is a constructor method and takes 4 parameters.
- tax() : Calculates the tax applied to the salary. If the employee's salary is less than 1000 TL, no tax will be applied.
- If the employee's salary is more than 1000 TL, 3% of the employee's salary will be taxed.
- bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
- raiseSalary() : It will calculate the salary increase based on the employee's start year. The current year is taken as 2021.
- If the employee has been working for less than 10 years, his salary will be increased by 5%.
If the employee has worked for more than 9 years and less than 20 years, his salary will be increased by 10%.
If the employee has been working for more than 19 years, a 15% raise will be made.
- toString() : It will print the information of the employee to the screen.




## Employee Class

```java
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

```


## Main Class

```java

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ali", 2000, 45, 1985);
        emp1.toString(emp1);
    }
}
```

