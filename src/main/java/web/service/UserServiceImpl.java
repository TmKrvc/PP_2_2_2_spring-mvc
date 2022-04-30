package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.dao.UserDAOImpl;
import web.model.User;


import java.util.List;

@Service
//@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;


    @Override

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    //@Transactional
    public void addUser(String name, String surname) {
        userDAO.addUser(name, surname);
    }

    @Override
    // @Transactional
    public void removeUser(int id) {
        userDAO.removeUser(id);
    }

    @Override
    // @Transactional
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void updateUser(int id, String name, String surname) {
        userDAO.updateUser(id, name, surname);

    }
}
