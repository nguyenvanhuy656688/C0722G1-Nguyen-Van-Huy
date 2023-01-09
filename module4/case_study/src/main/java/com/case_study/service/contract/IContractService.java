package com.case_study.service.contract;

import com.case_study.dto.IAttachFacilityDto;
import com.case_study.dto.IContractDto;
import com.case_study.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IContractService {
    Page<Contract> findAll(Pageable pageable);

    Page<IContractDto> contractList(Pageable pageable);

    void save(Contract contract);

    List<IAttachFacilityDto> listAttachFacility(int id);
}
