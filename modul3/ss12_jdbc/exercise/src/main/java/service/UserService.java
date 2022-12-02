package service;

import model.User;
import repository.IUserRepository;
import repository.UserRepository;

import java.util.List;

public class UserService implements IUserService {
    IUserRepository iUserRepository = new UserRepository();
    @Override
    public List<User> selectAllUsers() {
        return iUserRepository.selectAllUsers();
    }

    @Override
    public void insertUser(User newUser) {
        iUserRepository.insertUser(newUser);
    }

    @Override
    public User showFormEdit(int id) {
        return iUserRepository.showFormEdit(id);
    }

    @Override
    public List<User> searchByCountry(String country) {
        return iUserRepository.searchByCountry(country);
    }

    @Override
    public void updateUser(User user) {
        iUserRepository.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        iUserRepository.deleteUser(id);

    }
}
