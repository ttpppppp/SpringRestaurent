package com.StudySpring.restaurantproject.repository;

import com.StudySpring.restaurantproject.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestManager {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Users> getAllUserManagers() {
        String jpql = "SELECT u FROM Users u";
        TypedQuery<Users> query = entityManager.createQuery(jpql, Users.class);
        return query.getResultList();
    }
    public Users getUserManager(int id) {
        return entityManager.find(Users.class, id);
    }
}
