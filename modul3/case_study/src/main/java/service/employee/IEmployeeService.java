package service.employee;

import model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> list();

    boolean create(Employee employee);
}
