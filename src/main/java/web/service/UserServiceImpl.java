package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void addUser(String name, String surname) {
        userDAO.addUser(name, surname);
    }

    @Override
    public void removeUser(int id) {
        userDAO.removeUser(id);
    }

    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void updateUser(int id, String name, String surname) {
        userDAO.updateUser(id, name, surname);

    }
}
