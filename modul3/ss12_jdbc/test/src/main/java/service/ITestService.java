package service;

import model.Test;

import java.util.List;

public interface ITestService {
    void create(Test test);

    void edit(Test test);

    void delete(int id);

    List<Test> displayAllAfterDelete();

    List<Test> displayList();

    Test searchByEmail(String email);

    void showFormEdit(int id);
}
