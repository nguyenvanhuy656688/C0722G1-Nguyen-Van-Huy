package com.case_study.repository.facility;

import com.case_study.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IFacilityRepository extends JpaRepository<Facility,Integer> {
    @Query(value = "select c.* from `facility` c join `facility_type` ct on c.facility_type_id = ct.id  where c.name like %:name%  and ct.name like %:facilityTypeName%" ,nativeQuery = true )
    Page<Facility> listSearchByNameAndEmailAndCustomerType(@Param("name") String name,@Param("facilityTypeName") String facilityTypeName, Pageable pageable);
}
