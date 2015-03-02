package com.uttesh.spring.entitymanager.dao.impl;

import com.uttesh.spring.entitymanager.dao.IUserDAO;
import com.uttesh.spring.entitymanager.model.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

@Repository
//@Transactional(propagation = Propagation.MANDATORY, rollbackFor = {Exception.class})
public class UserDAOImpl implements IUserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(User user) {
        entityManager.persist(user);
        System.out.println("saved record : " + user.getId());
    }

    
    @Override
    public List<User> findAllUsers() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> cq = builder.createQuery(User.class);
        Root<User> root = cq.from(User.class);
        cq.select(root);
        return entityManager.createQuery(cq).getResultList();
    }

}
