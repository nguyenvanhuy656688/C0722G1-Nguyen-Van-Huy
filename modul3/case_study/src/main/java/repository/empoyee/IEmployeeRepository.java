package repository.empoyee;

import model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> list();

    boolean create(Employee employee);
}
