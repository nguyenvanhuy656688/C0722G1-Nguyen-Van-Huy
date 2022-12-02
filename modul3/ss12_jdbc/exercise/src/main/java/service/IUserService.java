package service;

import model.User;

import java.util.List;

public interface IUserService {
    List<User> selectAllUsers();

    void insertUser(User newUser);

    User showFormEdit(int id);

    List<User> searchByCountry(String country);

    void updateUser(User user);

    void deleteUser(int id);
}
