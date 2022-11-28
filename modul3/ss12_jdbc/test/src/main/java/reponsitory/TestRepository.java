package reponsitory;

import model.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class TestRepository implements ITestRepository{
    public void create(Test test) {
    }

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
    public void showFormEdit(int id) {

    }

    @Override
    public List<Test> displayList() {
        return null;
    }

    @Override
    public Test searchByEmail(String email) {
        return null;
    }
}
