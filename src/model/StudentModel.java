package model;

public class StudentModel extends UserModel{
    public int student_id;
    private String first_name;
    private String middle_name;
    private String last_name;
    private int user_id;
    private String contact;
    private String address;
    private String email;
    private String dob;
    private String reg_no;
    private String gender;
    private String blood_group;
    private String academic_background;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getAcademic_background() {
        return academic_background;
    }

    public void setAcademic_background(String academic_background) {
        this.academic_background = academic_background;
    }

    @Override
    public String toString() {
        return "StudentModel{" + "student_id=" + student_id + ", first_name=" + first_name + ", middle_name=" + middle_name + ", last_name=" + last_name + ", user_id=" + user_id + ", contact=" + contact + ", address=" + address + ", email=" + email + ", dob=" + dob + ", reg_no=" + reg_no + ", gender=" + gender + ", blood_group=" + blood_group + ", academic_background=" + academic_background + '}';
    }

    


   
    
    
}
