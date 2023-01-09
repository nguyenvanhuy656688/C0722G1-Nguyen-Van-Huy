package com.case_study.service.contract;

import com.case_study.dto.IAttachFacilityDto;
import com.case_study.dto.IContractDto;
import com.case_study.model.contract.Contract;
import com.case_study.repository.contract.IContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ContractService implements IContractService{
    @Autowired
    private IContractRepository iContractRepository;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return iContractRepository.findAll(pageable);
    }

    @Override
    public Page<IContractDto> contractList(Pageable pageable) {
        return iContractRepository.contractList(pageable);
    }


    @Override
    public void save(Contract contract) {
         iContractRepository.save(contract);
    }

    @Override
    public List<IAttachFacilityDto> listAttachFacility(int id) {
        return iContractRepository.listAttachFacility(id);
    }


}
