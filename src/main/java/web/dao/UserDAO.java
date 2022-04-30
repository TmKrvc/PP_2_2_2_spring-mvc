package web.dao;


import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;
@Transactional
public interface UserDAO {
    List<User> getAllUsers();
    void addUser(String name,String surname);
    void removeUser(int id);
    User getUser(int id);
    void updateUser(int id, String name, String surname);
}
