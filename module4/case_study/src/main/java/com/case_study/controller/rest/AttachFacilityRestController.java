package com.case_study.controller.rest;

import com.case_study.dto.IAttachFacilityDto;
import com.case_study.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("attachFacility")
@CrossOrigin("*")
public class AttachFacilityRestController {
    @Autowired
    private IContractService iContractService;
    @GetMapping("/showDetail/{id}")
    public ResponseEntity<List<IAttachFacilityDto>> getList(
            @PathVariable("id") int id) {
        List<IAttachFacilityDto> attachFacilityDtoList = iContractService.listAttachFacility(id);
        if (attachFacilityDtoList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(attachFacilityDtoList, HttpStatus.OK);
    }
}
