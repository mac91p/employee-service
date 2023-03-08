package pl.kurs.employeeservice.model;


import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(pesel, employee.pesel) && Objects.equals(position, employee.position) && Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel, salary, position, city);
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

