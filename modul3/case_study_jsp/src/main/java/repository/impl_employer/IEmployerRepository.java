package repository.impl_employer;

import model.Employer;

import java.util.List;

public interface IEmployerRepository {
    void deleteById(int id);

    List<Employer> displayADelete();

    boolean edit(Employer customer);

    void create(Employer customer);

    List<Employer> displayAll();

    List<Employer> search(int id);

    Employer findById();
}
