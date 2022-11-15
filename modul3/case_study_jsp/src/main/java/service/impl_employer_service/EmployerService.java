package service.impl_employer_service;

import model.Employer;
import repository.impl_employer.EmployerRepository;
import repository.impl_employer.IEmployerRepository;

import java.util.List;

public class EmployerService implements IEmployerService {
    private static IEmployerRepository iEmployerRepository = new EmployerRepository();


    @Override
    public void deleteById(int id) {
        iEmployerRepository.deleteById(id);
    }

    @Override
    public List<Employer> displayADelete() {
        return iEmployerRepository.displayADelete();
    }

    @Override
    public boolean edit(Employer customer) {
        return iEmployerRepository.edit(customer);
    }

    @Override
    public void create(Employer customer) {
        iEmployerRepository.create(customer);
    }

    @Override
    public List<Employer> displayAll() {
        return iEmployerRepository.displayAll();
    }

    @Override
    public List<Employer> search(int id) {
        return iEmployerRepository.search(id);
    }

    @Override
    public Employer findById(int id) {
        return iEmployerRepository.findById();
    }
}
