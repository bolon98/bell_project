package com.bell.project.service.office;

import com.bell.project.dao.office.OfficeDao;
import com.bell.project.filter.office.OfficeFilter;
import com.bell.project.filter.office.OfficeInSave;
import com.bell.project.filter.office.OfficeInUpdate;
import com.bell.project.model.Office;
import com.bell.project.model.mapper.MapperFacade;
import com.bell.project.view.office.OfficeIdView;
import com.bell.project.view.office.OfficeListView;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@Service
public class OfficeServiceImpl implements OfficeService{
    private final OfficeDao dao;
    private final MapperFacade mapperFacade;

    public OfficeServiceImpl(OfficeDao dao, MapperFacade mapperFacade) {
        this.dao = dao;
        this.mapperFacade = mapperFacade;
    }

    @Override
    @Transactional
    public List<OfficeListView> list(@Valid OfficeFilter officeFilter) {
        List<Office> all = dao.all(officeFilter.orgId, officeFilter.name, officeFilter.phone, officeFilter.isActive);
        return mapperFacade.mapAsList(all, OfficeListView.class);
    }

    @Override
    @Transactional
    public OfficeIdView id(Integer id) {
        Office office = dao.loadById(id);
        return mapperFacade.map(office, OfficeIdView.class);
    }

    @Override
    @Transactional
    public void update(@Valid OfficeInUpdate officeInUpdate) {
        Office office = dao.loadById(officeInUpdate.id);
        office.setName(officeInUpdate.name);
        office.setAddress(officeInUpdate.address);
        if (officeInUpdate.phone != null) {
            office.setPhone(officeInUpdate.phone);
        }
        if (officeInUpdate.isActive != null) {
            office.setActive(officeInUpdate.isActive);
        }
        dao.update(office);
    }

    @Override
    @Transactional
    public void add(@Valid OfficeInSave officeInSave) {
        Office office = new Office(officeInSave.name, officeInSave.address, officeInSave.phone, officeInSave.isActive, officeInSave.orgId);
        dao.save(office);
    }
}
