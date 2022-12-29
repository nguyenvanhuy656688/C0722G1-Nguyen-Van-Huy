package com.case_study.controller;

import com.case_study.model.contract.Contract;
import com.case_study.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private IContractService iContractService;

    @GetMapping("")
    public String list(Model model,@PageableDefault(size = 3) Pageable pageable){
        Page<Contract> contractList = iContractService.findAll(pageable);
        model.addAttribute("contractList",contractList);
        return "views/contract/list";
    }

    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("contract",new Contract());
        return "views/contract/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("contract") Contract contract){
        iContractService.save(contract);
        return "redirect:/contract";
    }
}
