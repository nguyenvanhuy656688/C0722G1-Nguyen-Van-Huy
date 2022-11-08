package service;

import model.User;

import java.util.List;

public interface IUserService {
    public User selectUser(int id);

    public List<User> selectAllUsers();

    public void insertUser(User user);

    public boolean isDeleteUser(int id);

    public boolean isUpdateUser(User user);

    public List<User> searchByCountry(String countrySearch);
}
