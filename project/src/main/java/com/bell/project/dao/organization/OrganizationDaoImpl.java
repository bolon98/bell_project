package com.bell.project.dao.organization;

import com.bell.project.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class OrganizationDaoImpl implements OrganizationDao{

    private final EntityManager em;

    @Autowired
    public OrganizationDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Organization> all() {
        TypedQuery<Organization> query = em.createQuery("SELECT o FROM Organization o", Organization.class);
        return query.getResultList();
    }

    @Override
    public Organization loadById(Integer id) {
        return em.find(Organization.class, id);
    }

    @Override
    public void update(Organization organization) {em.merge(organization);
    }

    @Override
    public void save(Organization organization) {em.persist(organization);

    }
}