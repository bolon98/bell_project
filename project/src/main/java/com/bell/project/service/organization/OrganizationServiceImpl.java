package com.bell.project.service.organization;

import com.bell.project.dao.organization.OrganizationDao;
import com.bell.project.filter.organization.OrganizationFilter;
import com.bell.project.filter.organization.OrganizationInSave;
import com.bell.project.filter.organization.OrganizationInUpdate;
import com.bell.project.model.Organization;
import com.bell.project.model.mapper.MapperFacade;
import com.bell.project.view.organization.OrganizationIdView;
import com.bell.project.view.organization.OrganizationListView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    private final OrganizationDao dao;
    private final MapperFacade mapperFacade;

    @Autowired
    public OrganizationServiceImpl(OrganizationDao dao, MapperFacade mapperFacade) {
        this.dao = dao;
        this.mapperFacade = mapperFacade;
    }

    @Override
    @Transactional
    public List<OrganizationListView> list(@Valid OrganizationFilter orgFilter) {
        List<Organization> all = dao.all();
        return mapperFacade.mapAsList(all, OrganizationListView.class);
    }

    @Override
    @Transactional
    public OrganizationIdView id(Integer id) {
        Organization organization = dao.loadById(id);
        return mapperFacade.map(organization, OrganizationIdView.class);
    }

    @Override
    @Transactional
    public void update(@Valid OrganizationInUpdate orgInUpdate) {
        Organization organization = dao.loadById(orgInUpdate.id);
        organization.setName(orgInUpdate.name);
        organization.setFullName(orgInUpdate.fullName);
        organization.setInn(orgInUpdate.inn);
        organization.setKpp(orgInUpdate.kpp);
        organization.setAddress(orgInUpdate.address);
        if (orgInUpdate.phone != null){
            organization.setPhone(orgInUpdate.phone);
        }
        organization.setActive(orgInUpdate.isActive);
        dao.update(organization);
    }

    @Override
    @Transactional
    public void add(@Valid OrganizationInSave orgInSave) {
        Organization organization = new Organization(orgInSave.name, orgInSave.fullName, orgInSave.inn, orgInSave.kpp, orgInSave.address, orgInSave.phone, orgInSave.isActive);
        dao.save(organization);
    }
}
