package com.case_study.service.facility;

import com.case_study.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface IFacilityService {
    Page<Facility> findAll(Pageable pageable);

    void deleteById(int id);

    void save(Facility facility);

    Optional<Facility> findById(int id);

    Page<Facility> listSearchByNameAndEmailAndCustomerType(String name, String facilityTypeName, Pageable pageable);
}
