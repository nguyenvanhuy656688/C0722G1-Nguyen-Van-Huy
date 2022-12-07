package service.employee;

import model.Employee;
import repository.empoyee.EmployeeRepository;
import repository.empoyee.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> list() {
        return iEmployeeRepository.list();
    }

    @Override
    public boolean create(Employee employee) {
        return iEmployeeRepository.create(employee);
    }
}
