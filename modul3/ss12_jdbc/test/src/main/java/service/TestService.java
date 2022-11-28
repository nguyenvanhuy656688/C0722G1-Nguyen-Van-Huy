package service;

import model.Test;
import reponsitory.ITestRepository;
import reponsitory.TestRepository;

import java.util.List;

public class TestService implements ITestService {
    private static ITestRepository testRepository = new TestRepository();

    @Override
    public void create(Test test) {

    }

    @Override
    public void edit(Test test) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Test> displayAllAfterDelete() {
        return null;
    }

    @Override
    public List<Test> displayList() {
        return null;
    }

    @Override
    public Test searchByEmail(String email) {
        return null;
    }

    @Override
    public void showFormEdit(int id) {

    }
}
