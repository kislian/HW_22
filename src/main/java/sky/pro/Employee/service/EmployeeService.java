package sky.pro.Employee.service;

import sky.pro.Employee.model.Employee;
import java.util.Map;


public interface EmployeeService {
    Employee add(String firstName, String lastName, String idPasswordNumber, Integer yearBirthday);

    Employee remove(String firstName, String lastName, String idPasswordNumber);

    Employee find(String firstName, String lastName, String idPasswordNumber);

    Map<String, Employee> allEmployeeInfo();
}
