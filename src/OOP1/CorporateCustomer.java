package OOP1;

public class CorporateCustomer extends Customer {    //Sen de bir Customer 'sın...
    private String companyName;
    private String taskNumber;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }
}
