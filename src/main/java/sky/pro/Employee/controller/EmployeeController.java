package sky.pro.Employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.Employee.model.Employee;
import sky.pro.Employee.service.EmployeeService;

import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String idPasswordNumber, @RequestParam Integer yearBirthday) {
        return service.add(firstName, lastName, idPasswordNumber, yearBirthday);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String idPasswordNumber) {
        return service.remove(firstName, lastName, idPasswordNumber);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String idPasswordNumber) {
        return service.find(firstName, lastName, idPasswordNumber);
    }

    @GetMapping
    public Map<String, Employee> allEmployeeInfo() {
        return service.allEmployeeInfo();
    }
}
