package com.bell.project.dao.user;

import com.bell.project.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    private final EntityManager em;

    public UserDaoImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<User> all() {
        return null;
    }

    @Override
    public User loadById(Integer id) {
        return em.find(User.class, id);
    }

    @Override
    public void update(User user) {
        em.merge(user);
    }

    @Override
    public void save(User user) {
        em.persist(user);
    }
}
