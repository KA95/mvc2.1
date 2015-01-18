package dao;

import objects.User;

import java.util.List;

/**
 * Created by Sergio on 1/17/2015.
 */
public interface IUserDao {
    public List<User> getAllUsers();
    public List<User> getUserByFirstName(String firstName);
    public void insert(User user);
    public void delete(long userOID);
    public void update(User user);
}
