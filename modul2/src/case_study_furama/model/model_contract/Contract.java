package case_study_furama.model.model_contract;

public class Contract {
    private String contractNumber;
    private String bookingCode;
    private Integer advanceDeposit;
    private String totalPay ;
    private String customerCode;

    public Contract() {
    }

    public Contract(String contractNumber, String bookingCode, Integer advanceDeposit, String totalPay, String customerCode) {

        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.advanceDeposit = advanceDeposit;
        this.totalPay = totalPay;
        this.customerCode = customerCode;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public Integer getAdvanceDeposit() {
        return advanceDeposit;
    }

    public void setAdvanceDeposit(Integer advanceDeposit) {
        this.advanceDeposit = advanceDeposit;
    }

    public String getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(String totalPay) {
        this.totalPay = totalPay;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", advanceDeposit=" + advanceDeposit +
                ", totalPay='" + totalPay + '\'' +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}
