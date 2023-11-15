package model;

public class AdminModel extends UserModel {

    private String first_name;
    private String middle_name;
    private String last_name;
    private String emp_no;
    private String join_date;
    private String shift;
    private String emp_type;
    private String dob;
    private String pan_no;
    private String contact;
    private String email;
    private String address;
    private String status;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(String emp_no) {
        this.emp_no = emp_no;
    }

    public String getJoin_date() {
        return join_date;
    }

    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getEmp_type() {
        return emp_type;
    }

    public void setEmp_type(String emp_type) {
        this.emp_type = emp_type;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPan_no() {
        return pan_no;
    }

    public void setPan_no(String pan_no) {
        this.pan_no = pan_no;
    }

    public String getContact() {
        return contact;
    }

    public void setCongtact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emil) {
        this.email = emil;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AdminModel{" + "first_name=" + first_name + ", middle_name=" + middle_name + ", last_name=" + last_name + ", emp_no=" + emp_no + ", join_date=" + join_date + ", shift=" + shift + ", emp_type=" + emp_type + ", dob=" + dob + ", pan_no=" + pan_no + ", congtact=" + contact + ", emil=" + email + ", address=" + address + ", status=" + status + '}';
    }

}
