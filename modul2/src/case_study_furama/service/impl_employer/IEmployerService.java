package case_study_furama.service.impl_employer;

import java.io.IOException;

public interface IEmployerService {
    void displayList() throws IOException;

    void addEmployer() throws IOException;

    void editEmployer() throws IOException;
}
