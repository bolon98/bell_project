package com.bell.project.dao.office;

import com.bell.project.model.Office;
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
public class OfficeDaoImpl implements OfficeDao{

    private final EntityManager em;

    @Autowired
    public OfficeDaoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Office> all(Organization orgId, String name, String phone, Boolean isActive) {
        CriteriaQuery<Office> criteria = buildCriteria(orgId, name, phone, isActive);
        TypedQuery<Office> query = em.createQuery(criteria);
        return query.getResultList();
    }

    @Override
    public Office loadById(Integer id) {
        return em.find(Office.class, id);
    }

    @Override
    public void update(Office office) {
        em.merge(office);
    }

    @Override
    public void save(Office office) {
        em.persist(office);
    }

    private CriteriaQuery<Office> buildCriteria(Organization orgId, String name, String phone, Boolean isActive) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Office> criteria = builder.createQuery(Office.class);
        Root<Office> officeRoot = criteria.from(Office.class);
        List<Predicate> predicates = new ArrayList<Predicate>();
        predicates.add(builder.equal(officeRoot.get("orgId"), orgId));
//        if (name != null) {
//            predicates.add(builder.equal(officeRoot.get("name"), name));
//        }
//        if (phone.length() > 0) {
//            predicates.add(builder.equal(officeRoot.get("phone"), phone));
//        }
//        if (isActive != null) {
//            predicates.add(builder.equal(officeRoot.get("isActive"), isActive));
//        }
        criteria.select(officeRoot).where(predicates.toArray(new Predicate[]{}));
        return criteria;
    }
}
