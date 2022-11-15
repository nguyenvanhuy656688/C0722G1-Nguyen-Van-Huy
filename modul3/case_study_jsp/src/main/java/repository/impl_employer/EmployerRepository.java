package repository.impl_employer;

import model.Employer;

import java.util.List;

public class EmployerRepository implements IEmployerRepository {
    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<Employer> displayADelete() {
        return null;
    }

    @Override
    public boolean edit(Employer customer) {
        return false;
    }

    @Override
    public void create(Employer customer) {

    }

    @Override
    public List<Employer> displayAll() {
        return null;
    }

    @Override
    public List<Employer> search(int id) {
        return null;
    }

    @Override
    public Employer findById() {
        return null;
    }
}
