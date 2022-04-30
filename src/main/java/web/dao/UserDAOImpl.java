package web.dao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        String jpql = "SELECT u FROM User u";
        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        return query.getResultList();
    }

    @Override
    public void addUser(String name, String surname) {
        User user = new User(name, surname);
        entityManager.persist(user);
    }

    @Override
    public void removeUser(int id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public User getUser(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(int id, String name, String surname) {
        User user = getUser(id);
        user.setName(name);
        user.setSurname(surname);
        entityManager.merge(user);
    }
}
