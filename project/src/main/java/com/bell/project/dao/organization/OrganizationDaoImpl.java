package com.bell.project.dao.organization;

import com.bell.project.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OrganizationDaoImpl implements OrganizationDao{

    private final EntityManager em;

    @Autowired
    public OrganizationDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Organization> all(String name, String inn, Boolean isActive) {
        CriteriaQuery<Organization> criteria = buildCriteria(name, inn, isActive);
        TypedQuery<Organization> query = em.createQuery(criteria);
        return query.getResultList();
    }

    @Override
    public Organization loadById(Integer id) {
        return em.find(Organization.class, id);
    }

    @Override
    public void update(Organization organization) {
        em.merge(organization);
    }

    @Override
    public void save(Organization organization) {em.persist(organization);
    }

    private CriteriaQuery<Organization> buildCriteria(String name, String inn, Boolean isActive) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Organization> criteria = builder.createQuery(Organization.class);
        Root<Organization> org = criteria.from(Organization.class);
        List<Predicate> predicates = new ArrayList<Predicate>();
        predicates.add(builder.equal(org.get("name"), name));
        if (inn.length() > 0) {
            predicates.add(builder.equal(org.get("inn"), inn));
        }
        if (isActive != null) {
            predicates.add(builder.equal(org.get("isActive"), isActive));
        }
        criteria.select(org).where(predicates.toArray(new Predicate[]{}));
        return criteria;
    }
}