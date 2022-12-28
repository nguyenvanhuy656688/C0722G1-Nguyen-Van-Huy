package com.case_study.service.facility;

import com.case_study.model.facility.Facility;
import com.case_study.repository.facility.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class FacilityService implements IFacilityService{
    @Autowired
    private IFacilityRepository iFacilityRepository;

    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return iFacilityRepository.findAll(pageable);
    }

    @Override
    public void deleteById(int id) {
         iFacilityRepository.deleteById(id);
    }

    @Override
    public void save(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public Optional<Facility> findById(int id) {
        return iFacilityRepository.findById(id);
    }

    @Override
    public Page<Facility> listSearchByNameAndEmailAndCustomerType(String name, String facilityTypeName, Pageable pageable) {
        return null;
    }
}
