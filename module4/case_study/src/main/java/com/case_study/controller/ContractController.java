package com.case_study.controller;

import com.case_study.dto.ContractDetailDto;
import com.case_study.dto.ContractDto;
import com.case_study.dto.IContractDto;
import com.case_study.model.contract.Contract;
import com.case_study.model.contract.ContractDetail;
import com.case_study.model.employee.Employee;
import com.case_study.service.contract.AttachFacilityService;
import com.case_study.service.contract.IAttachFacilityService;
import com.case_study.service.contract.IContractDetailService;
import com.case_study.service.contract.IContractService;
import com.case_study.service.customer.ICustomerService;
import com.case_study.service.employee.IEmployeeService;
import com.case_study.service.facility.IFacilityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService iContractService;

    @Autowired
    private IFacilityService iFacilityService;

    @Autowired
    private ICustomerService iCustomerService;


    @Autowired
    private IContractDetailService iContractDetailService;

    @Autowired
    private IAttachFacilityService iAttachFacilityService;

    @GetMapping("")
    public String list(Model model,@PageableDefault(size = 10) Pageable pageable){
        Page<IContractDto> contractList = iContractService.contractList(pageable);
        model.addAttribute("contractList",contractList);
        model.addAttribute("customerList",iCustomerService.findAll(pageable));
        model.addAttribute("facilityList",iFacilityService.findAll(pageable));
        model.addAttribute("contract",new Contract());
        model.addAttribute("contractDetail",new ContractDetailDto());
        model.addAttribute("attachFacilityList",iAttachFacilityService.findAll());
        return "views/contract/list";
    }


    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("contract") ContractDto contractDto, BindingResult bindingResult,Model model,Pageable pageable){
        new ContractDto().validate(contractDto,bindingResult);
        Contract contract = new Contract();
        BeanUtils.copyProperties(contractDto,contract);
        if (bindingResult.hasErrors()){
            model.addAttribute("customerList",iCustomerService.findAll(pageable));
            model.addAttribute("facilityList",iFacilityService.findAll(pageable));
            return "views/contract/list";
        }
        iContractService.save(contract);
        return "redirect:/contract";
    }

    @PostMapping("/createDetail")
    public String createContractDetail(@ModelAttribute("contractDetail") ContractDetailDto contractDetailDto){
        ContractDetail contractDetail = new ContractDetail();
        contractDetail.setContract(contractDetailDto.getContract());
        contractDetail.setAttachFacility(contractDetailDto.getAttachFacility());
        contractDetail.setQuantity(contractDetailDto.getQuantity());
        iContractDetailService.save(contractDetail);
        return "redirect:/contract";
    }


}
