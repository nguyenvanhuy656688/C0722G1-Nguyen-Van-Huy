package service;

import model.User;

import java.util.List;

public class UserService implements IUserService{
    @Override
    public void insertUser(User user);

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean isDeleteUser(int id);

    boolean isUpdateUser(User user);

    List<User> searchByCountry(String countrySearch);

    User getUserById(int id);

    void insertUserStore(User user);

    void addUserTransaction(User user, int[] permission);

    void insertUpdateWithoutTransaction();

    void insertUpdateUseTransaction();

    List<User> displayListUser();

    boolean isEditUser(User user);

    boolean isDeleteUserCall(int id);
}
