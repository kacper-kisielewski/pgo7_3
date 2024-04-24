abstract public class Person {
    String firstName;
    String lastName;
    int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    abstract int getAge();
}
