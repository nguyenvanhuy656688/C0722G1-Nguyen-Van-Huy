package com.case_study.dto;

import com.case_study.model.customer.Customer;
import com.case_study.model.employee.Employee;
import com.case_study.model.facility.Facility;
import jakarta.persistence.ManyToOne;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Date;

public class ContractDto implements Validator {
    private int id;
    private Date startDate;
    private Date endDate;
    private double deposit;
    private double totalMoney;
    private Customer customer;
    private Facility facility;
    private Employee employee;

    public ContractDto() {
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ContractDto contractDto = (ContractDto) target;
        //Định dạng ngày
        if (contractDto.startDate.equals("")) {
            errors.rejectValue("startDate", "startDate", "Không được để trống");
        }
        if (contractDto.endDate.equals("")) {
            errors.rejectValue("endDate", "endDate", "Không được để trống");
        }
        Date dateStart = contractDto.startDate;
        Date dateEnd = contractDto.endDate;
        if ((dateStart.getYear() == dateEnd.getYear() && dateStart.getMonth() > dateEnd.getMonth()) || (dateStart.getYear() > endDate.getYear())) {
            errors.rejectValue("startDate", "startDate", "Vui lòng nhập đúng");
        }

        //Đặt cọc
        if (contractDto.getDeposit() <= 0) {
            errors.rejectValue("deposit", "deposit", "Tiền đặt cọc phải lớn hơn 0");
        } else {
            String deposit = String.valueOf(contractDto.getDeposit());
            if (deposit.equals("")) {
                errors.rejectValue("deposit", "deposit", "Vui lòng nhập tiền đặt cọc");
            }
        }


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
