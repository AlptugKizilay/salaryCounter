public class Employee {
    String name;
    double salary;
    int workHoursWeekly;
    int hireYear;
    double increase;
    double tax;


    Employee e1;

    Employee(String name, int salary, int workHoursWeekly, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHoursWeekly = workHoursWeekly;
        this.hireYear = hireYear;
    }


    double tax() {
        if (this.salary <= 1000) {
            return 0;
        } else {
            tax = this.salary * 0.03;

            return tax;
        }
    }

    int bonus() {
        if (this.workHoursWeekly > 40) {
            int extraHour = this.workHoursWeekly - 40;
            return extraHour * 30;

        } else {
            return 0;
        }
    }

    double raiseSalary() {
        int currentYear = 2021;
        int workYear = currentYear - this.hireYear;
        if (workYear < 10) {
            increase = this.salary * 0.05;
            return increase;
        } else if (workYear >= 10 && workYear < 20) {
            increase = this.salary * 0.10;
            return increase;
        } else if (workYear >= 20) {
            increase = this.salary * 0.15;
            return increase;
        } else return 0;
    }

    void print() {
        System.out.println("Name : " + this.name);
        System.out.println("Weekly work hours : " + this.workHoursWeekly);
        System.out.println("Tax : " + tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Increase : " + this.raiseSalary());
        this.salary = this.salary - tax + raiseSalary() + bonus();
        System.out.println("Salary: " + this.salary);


    }


}
