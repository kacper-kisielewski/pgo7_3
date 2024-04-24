final public class Manager extends Employee {
    double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return String.format("Manage with lastName %s and age %d has salary %.1f", lastName, getAge(), getSalary());
    }
}
