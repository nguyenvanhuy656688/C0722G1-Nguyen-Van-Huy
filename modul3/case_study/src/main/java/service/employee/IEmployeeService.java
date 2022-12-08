package service.employee;

import model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> list();

    boolean create(Employee employee);

    boolean edit(Employee employee);

    Employee EditById(int id);

    void deleteById(int id);

    List<Employee> search(int idSearch, String nameSearch, String addressSearch);
}
