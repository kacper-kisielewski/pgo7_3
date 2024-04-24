import java.time.LocalDate;

public class Employee extends Person {
    int hireDate;
    String companyName;
    double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    static int getCurrentYear() {
        return LocalDate.now().getYear();
    }

    @Override
    int getAge() {
        return getCurrentYear() - birthdayYear;
    }

    int getJobSeniority() {
        return getCurrentYear() - hireDate;
    }

    double getSalary() {
        return salary;
    }
}
