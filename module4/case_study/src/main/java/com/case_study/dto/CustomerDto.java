package com.case_study.dto;

import com.case_study.model.customer.Customer;
import com.case_study.model.customer.CustomerType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.domain.Page;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerDto implements Validator {
    private int id;
    private String name;
    private String dateOfBirth;
    private boolean gender;
    @Column(unique = true)
    private String idCard;
    @Column(unique = true)
    private String phoneNumber;
    @Column(unique = true)
    private String email;
    private String address;
    private CustomerType customerType;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }


    public void checkExist(Page<Customer> customerList, CustomerDto customerDto, Errors errors) {
        for (Customer customer : customerList) {
            if (customer.getEmail().equals(customerDto.email))
                errors.rejectValue("email", "email", "Email đã tồn tại");
            if (customer.getPhoneNumber().equals(customerDto.phoneNumber))
                errors.rejectValue("phoneNumber", "phoneNumber", "phoneNumber đã tồn tại");
            if (customer.getIdCard().equals(customerDto.idCard))
                errors.rejectValue("idCard", "idCard", "idCard đã tồn tại");
        }
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomerDto customerDto = (CustomerDto) target;
        //Name
        if (customerDto.getName().matches("")) {
            errors.rejectValue("name", "name", "Tên khách hàng không được để trống.");
        } else if (!customerDto.getName().matches("^[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽề\" +\n" +
                "\"ềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\\\s\\\\W|_]+$"))
            errors.rejectValue("name", "name", "Mời nhập tên đàng hoàng");


        //Day birth
        if (customerDto.dateOfBirth.matches("")) {
            errors.rejectValue("dateOfBirth", "dateOfBirth", "Vui lòng chọn ngày sinh");
        } else {
            LocalDate dayOfBirth = LocalDate.parse(customerDto.dateOfBirth);
            LocalDate now = LocalDate.now();
            Period checkAge = Period.between(dayOfBirth, now);
            if (checkAge.getYears() < 18 | checkAge.getYears() > 100) {
                errors.rejectValue("dateOfBirth", "dateOfBirth", "Tuổi phải lớn hơn hoặc bằng 18 và nhỏ hơn 100");
            }
        }
        //Email

        if (customerDto.email.matches("")) {
            errors.rejectValue("dateOfBirth", "dateOfBirth", "Vui lòng chọn ngày sinh");
        } else if (!customerDto.email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"))
            errors.rejectValue("email", "email", "Mời nhập đúng định dạng");
        //PhoneNumber
        if (customerDto.phoneNumber.matches("")) {
            errors.rejectValue("dateOfBirth", "dateOfBirth", "Vui lòng chọn ngày sinh");
        } else if (!customerDto.phoneNumber.matches("(84|0[3|5|7|8|9])+([0-9]{8})\\b"))
            errors.rejectValue("phoneNumber", "phoneNumber", "Mời nhập đúng định dạng phoneNumber");
        //IdCard
        if (customerDto.idCard.matches("")) {
            errors.rejectValue("dateOfBirth", "dateOfBirth", "Vui lòng chọn ngày sinh");
        } else if (!customerDto.idCard.matches("[0-9]{9}|[0-9]{12}"))
            errors.rejectValue("idCard", "idCard", "Mời nhập đúng định dạng");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
