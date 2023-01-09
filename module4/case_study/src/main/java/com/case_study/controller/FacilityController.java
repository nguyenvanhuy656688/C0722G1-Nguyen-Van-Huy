package com.case_study.controller;

import com.case_study.dto.CustomerDto;
import com.case_study.dto.FacilityDto;
import com.case_study.model.customer.Customer;
import com.case_study.model.customer.CustomerType;
import com.case_study.model.facility.Facility;
import com.case_study.model.facility.FacilityType;
import com.case_study.model.facility.RentType;
import com.case_study.service.facility.IFacilityService;
import com.case_study.service.facility.IFacilityTypeService;
import com.case_study.service.facility.IRentTypeService;
import com.case_study.service.facility.RentTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    private IFacilityService iFacilityService;

    @Autowired
    private IFacilityTypeService iFacilityTypeService;

    @Autowired
    private IRentTypeService iRentTypeService;


    @GetMapping("")
    public String list(Model model, @PageableDefault(size = 3) Pageable pageable) {
        Page<Facility> facilityList = iFacilityService.findAll(pageable);
        model.addAttribute("facilityList", facilityList);
        model.addAttribute("facilityTypeList", iFacilityTypeService.findAll());
        return "views/facility/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        List<FacilityType> facilityTypeList = iFacilityTypeService.findAll();
        List<RentType> rentTypeList = iRentTypeService.findAll();
        model.addAttribute("rentTypeList", rentTypeList);
        model.addAttribute("facilityTypeList", facilityTypeList);
        model.addAttribute("facilityDto", new Facility());
        return "views/facility/create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("facilityDto") FacilityDto facilityDto, BindingResult bindingResult, Model model, Pageable pageable) {
        new FacilityDto().validate(facilityDto, bindingResult);
        new FacilityDto().checkExist(iFacilityService.findAll(pageable), facilityDto, bindingResult);
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDto, facility);
        if (bindingResult.hasErrors()) {
            model.addAttribute("rentTypeList", iRentTypeService.findAll());
            model.addAttribute("facilityTypeList", iFacilityTypeService.findAll());
            model.addAttribute("mess", "Thêm mới không thành công");
            return "views/facility/create";
        }
        iFacilityService.save(facility);
        model.addAttribute("mess", "thêm mới thành công");
        return "views/facility/create";
    }

    @GetMapping("{id}/delete")
    public String delete(@PathVariable("id") int id) {
        iFacilityService.deleteById(id);
        return "redirect:/facility";
    }

    @GetMapping("/{id}/edit")
    public String showFormEdit(@PathVariable("id") int id, Model model) {
        List<RentType> rentTypeList = iRentTypeService.findAll();
        model.addAttribute("facility", iFacilityService.findById(id).orElse(null));
        model.addAttribute("rentTypeList", rentTypeList);
        model.addAttribute("facilityTypeList", iFacilityTypeService.findAll());
        return "views/facility/edit";
    }

    @PostMapping("/edit")
    public String edit(@Validated @ModelAttribute("facility") FacilityDto facilityDto, BindingResult bindingResult, Model model) {
        new FacilityDto().validate(facilityDto, bindingResult);
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDto, facility);
        iFacilityService.save(facility);
        model.addAttribute("mess", "chỉnh sửa thành công");
        return "views/facility/edit";
    }

    @PostMapping("/search")
    public String searchByNameAndFacilityType(@RequestParam String name, @RequestParam String facilityTypeName, Model model, @PageableDefault(size = 5) Pageable pageable) {
        Page<Facility> facilityList = iFacilityService.listSearchByNameAndEmailAndCustomerType(name, facilityTypeName, pageable);
        model.addAttribute("facilityList", facilityList);
        model.addAttribute("facilityTypeList", iFacilityTypeService.findAll());
        model.addAttribute("facilityTypeName", facilityTypeName);
        return "views/facility/list";
    }

}
