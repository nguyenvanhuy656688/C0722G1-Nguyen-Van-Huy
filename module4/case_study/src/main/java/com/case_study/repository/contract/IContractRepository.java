package com.case_study.repository.contract;

import com.case_study.dto.IContractDto;
import com.case_study.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IContractRepository extends JpaRepository<Contract,Integer> {
    @Query(value = "select ctr.id, f.`name` as nameFacility, c.`name` as nameCustomer, ctr.start_date as startDate, ctr.end_date as endDate, ctr.deposit, ifnull(f.cost,0) + sum(ifnull(af.cost * cd.quantity,0)) as sumMoney from `customer` c join `contract` ctr on ctr.customer_id=c.id join `facility` f on f.id= ctr.facility_id left join `attach_facility` af on af.id=ctr.id left join `contract_detail` cd on cd.contract_id = ctr.id group by ctr.id, c.id order by ctr.id", nativeQuery = true)
    Page<IContractDto> contractList(Pageable pageable);

}
