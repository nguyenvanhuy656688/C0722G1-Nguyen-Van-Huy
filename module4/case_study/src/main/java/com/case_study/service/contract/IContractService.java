package com.case_study.service.contract;

import com.case_study.dto.ContractDto;
import com.case_study.dto.IContractDto;
import com.case_study.model.contract.Contract;
import com.case_study.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IContractService {
    Page<Contract> findAll(Pageable pageable);

    Page<IContractDto> contractList(Pageable pageable);

    void save(Contract contract);


}
