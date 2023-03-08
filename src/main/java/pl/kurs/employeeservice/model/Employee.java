package pl.kurs.employeeservice.model;


public class Employee {

    private String firstName;
    private String lastName;
    private String pesel;
    private double salary;
    private String position;
    private String city;

    public Employee(String firstName, String lastName, String pesel, double salary, String position, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.salary = salary;
        this.position = position;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

