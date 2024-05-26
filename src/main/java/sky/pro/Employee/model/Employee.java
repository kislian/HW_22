package sky.pro.Employee.model;

import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String idPasswordNumber;
    private final Integer yearBirthday;
    private final Integer salary;
    private final Integer departmentNumber;

    public Employee(String firstName, String lastName, String idPasswordNumber, Integer yearBirthday, Integer salary, Integer departmentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idPasswordNumber = idPasswordNumber;
        this.yearBirthday = yearBirthday;
        this.salary = salary;
        this.departmentNumber = departmentNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idPasswordNumber='" + idPasswordNumber + '\'' +
                ", yearBirthday=" + yearBirthday +
                ", salary=" + salary +
                ", departmentNumber=" + departmentNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(idPasswordNumber, employee.idPasswordNumber) && Objects.equals(yearBirthday, employee.yearBirthday) && Objects.equals(salary, employee.salary) && Objects.equals(departmentNumber, employee.departmentNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, idPasswordNumber, yearBirthday, salary, departmentNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdPasswordNumber() {
        return idPasswordNumber;
    }

    public Integer getYearBirthday() {
        return yearBirthday;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartmentNumber() {
        return departmentNumber;
    }
}

