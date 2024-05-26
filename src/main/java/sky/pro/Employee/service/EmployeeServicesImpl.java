package sky.pro.Employee.service;

import org.springframework.stereotype.Service;
import sky.pro.Employee.exception.EmployeeAllreadyAddException;
import sky.pro.Employee.exception.EmployeeNoFoundException;
import sky.pro.Employee.model.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class EmployeeServicesImpl implements EmployeeService {
    public final Map<String, Employee> employeeMap = new HashMap<>();

    @Override
    public Employee add(String firstName, String lastName, String idPasswordNumber, Integer yearBirthday) {
        Employee employee = new Employee(firstName, lastName, idPasswordNumber, yearBirthday, salaryValueGenerator(), numberDepartmentGenerator());
        String key = getKey(firstName, lastName, idPasswordNumber);
        if (employeeMap.containsKey(key)) {
            throw new EmployeeAllreadyAddException();
        }
        employeeMap.put(key, employee);
        return employee;
    }

    @Override
    public Employee remove(String firstName, String lastName, String idPasswordNumber) {
        String key = getKey(firstName, lastName, idPasswordNumber);
        if (employeeMap.containsKey(key)) {
            return employeeMap.remove(key);
        }
        throw new EmployeeNoFoundException();
    }

    @Override
    public Employee find(String firstName, String lastName, String passwordNumber) {
        String key = getKey(firstName, lastName, passwordNumber);
        if (employeeMap.containsKey(key)) {
            return employeeMap.get(key);
        }
        throw new EmployeeNoFoundException();
    }

    private static String getKey(String firstName, String lastName, String passwordNumber) {
        return firstName + lastName + passwordNumber;
    }

    @Override
    public Map<String, Employee> allEmployeeInfo() {
        return new HashMap<>(employeeMap);
    }

    private int numberDepartmentGenerator() {
        Random random = new Random();
        int minimumScore = 1;
        int departmentNumberGenerator = random.nextInt(5) + minimumScore;
        return departmentNumberGenerator;
    }

    private int salaryValueGenerator() {
        Random random = new Random();
        int minimumScore = 100_000;
        int salaryValueGenerator = random.nextInt(300_000) + minimumScore;
        return salaryValueGenerator;
    }

}
