package reponsitory;

import model.Test;

import java.util.List;

public interface ITestRepository {

    void create(Test test);

    void edit(Test test);

    void delete(int id);

    List<Test> displayAllAfterDelete();

    void showFormEdit(int id);

    List<Test> displayList();

    Test searchByEmail(String email);
}
