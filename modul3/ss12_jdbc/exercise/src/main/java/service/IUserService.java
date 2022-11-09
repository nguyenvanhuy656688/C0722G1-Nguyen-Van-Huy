package service;

import model.User;

import java.util.List;

public interface IUserService {
     User selectUser(int id);

     List<User> selectAllUsers();

     void insertUser(User user);

     boolean isDeleteUser(int id);

     boolean isUpdateUser(User user);

     List<User> searchByCountry(String countrySearch);
}
