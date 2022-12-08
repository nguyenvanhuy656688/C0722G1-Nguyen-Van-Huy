package repository.empoyee;

import model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> list();

    boolean create(Employee employee);

    Employee editById(int id);

    void deleteById(int id);

    boolean edit(Employee employee);

    List<Employee> search(int idSearch, String nameSearch, String addressSearch);
}
