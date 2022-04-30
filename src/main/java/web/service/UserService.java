package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(String name,String surname);
    void removeUser(int id);
    User getUser(int id);
    void updateUser(int id, String name, String surname);
}
