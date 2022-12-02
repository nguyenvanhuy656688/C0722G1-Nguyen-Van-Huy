package repository;

import model.User;

import java.util.List;

public interface IUserRepository {
    User showFormEdit(int id);

    void insertUser(User user);

    List<User> selectAllUsers();

    List<User> searchByCountry(String country);

    void updateUser(User user);

    void deleteUser(int id);
}
