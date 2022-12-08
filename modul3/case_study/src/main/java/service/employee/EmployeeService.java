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

    @Override
    public boolean edit(Employee employee) {
        return iEmployeeRepository.edit(employee);
    }

    @Override
    public Employee EditById(int id) {
        return iEmployeeRepository.editById(id);
    }

    @Override
    public void deleteById(int id) {
        iEmployeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> search(int idSearch, String nameSearch, String addressSearch) {
        return iEmployeeRepository.search(idSearch,nameSearch,addressSearch);
    }
}
