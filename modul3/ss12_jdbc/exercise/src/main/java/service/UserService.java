package service;

import model.User;
import repository.IUserRepository;
import repository.UserRepository;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService{
    private IUserRepository iUserRepository = new UserRepository();

    public UserService() {
    }

    @Override
    public void insertUser(User user) {
        try {
            iUserRepository.insertUser(user);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public User selectUser(int id) {
        return iUserRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return iUserRepository.selectAllUsers();
    }

    @Override
    public boolean isDeleteUser(int id) {
        return iUserRepository.isDeleteUser(id);
    }

    @Override
    public boolean isUpdateUser(User user) {
        return iUserRepository.isUpdateUser(user);
    }

    @Override
    public List<User> searchByCountry(String countrySearch) {
        return iUserRepository.searchByCountry(countrySearch);
    }
}
