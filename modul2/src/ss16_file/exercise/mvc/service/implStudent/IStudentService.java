package ss16_file.exercise.mvc.service.implStudent;

import mvc.service.implStudent.StudentException;

public interface IStudentService {

    void addStudent() throws StudentException;

     void displayAllStudent();

    void removeStudent();

    void searchStudent();

    void editStudent();

    void sortStudent();
}
