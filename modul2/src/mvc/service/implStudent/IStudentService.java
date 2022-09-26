package mvc.service.implStudent;

public interface IStudentService {

    void addStudent() throws StudentException;

     void displayAllStudent();

    void removeStudent();

    void searchStudent();

    void editStudent();

    void sortStudent();
}
