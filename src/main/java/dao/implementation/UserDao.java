package dao.implementation;

import dao.IUserDao;
import objects.User;

import java.util.List;

/**
 * Created by Sergio on 1/17/2015.
 */
public class UserDao implements IUserDao {
    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public List<User> getUserByFirstName(String firstName) {
        return null;
    }

    @Override
    public void insert(User user) {

    }

    @Override
    public void delete(long userOID) {

    }

    @Override
    public void update(User user) {

    }
}
