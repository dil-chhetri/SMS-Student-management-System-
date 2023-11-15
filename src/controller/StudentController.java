
package controller;

import DAO.StudentDAO;
import DAO.impl.StudentDAOImpl;
import dbconfig.DatabaseConnection;
import java.sql.ResultSet;
import model.StudentModel;



public class StudentController {

    public int student_id;
    public String first_name;
    public String middle_name;
    public String last_name;
    public String contact;
    public String address;
    public String email;
    public String dob;
    public String reg_no;
    public String gender;
    public String blood_group;
    public String academic_background;
    
        public StudentController( String firstname, String middlename, String lastname, String address, String email, String dob, String reg_no, String gender, String bloodgroup, String academic_background){
         
        this.first_name = firstname;
        this.middle_name = middlename;
        this.last_name = lastname;
       
        this.address = address;
        this.email = email;
        this.dob = dob;
        this.reg_no = reg_no;
        this.gender = gender;
        this.blood_group = bloodgroup;
        this.academic_background = academic_background;
    }

    public StudentController() {
        
    }


        
    public boolean addStudent(StudentController sc){
                StudentDAO sd = new StudentDAOImpl();
        StudentModel sm = new StudentModel();
        sm.setFirst_name(sc.first_name);
        sm.setMiddle_name(sc.middle_name);
        sm.setLast_name(sc.last_name);
        sm.setContact(sc.contact);
        sm.setAddress(sc.address);
        sm.setEmail(sc.email);
        sm.setDob(sc.dob);
        sm.setReg_no(sc.reg_no);
        sm.setGender(sc.gender);
        sm.setBlood_group(sc.blood_group);
        sm.setAcademic_background(sc.academic_background);
        if(sd.create(sm)){
            return true;
        }
        return false;
    }
    
    public ResultSet getStudentList(){
         ResultSet rs = null;
        try {
            String sql = "SELECT * FROM sms_student";
            rs = DatabaseConnection.select(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public boolean getStudentDetail(){
        return true;
    }
    public boolean updateStudent(StudentController sc){
       StudentDAO sd = new StudentDAOImpl();
        StudentModel sm = new StudentModel();
        sm.setStudent_id(sc.student_id);
        sm.setFirst_name(sc.first_name);
        sm.setMiddle_name(sc.middle_name);
        sm.setLast_name(sc.last_name);
        sm.setContact(sc.contact);
        sm.setAddress(sc.address);
        sm.setEmail(sc.email);
        sm.setDob(sc.dob);
        sm.setReg_no(sc.reg_no);
        sm.setGender(sc.gender);
        sm.setBlood_group(sc.blood_group);
        sm.setAcademic_background(sc.academic_background);
        
            
        
        
        if(sd.update(sm)){
            return true;
        }
        return false;
    }
    public boolean deleteStudent(StudentController sc){
             StudentDAO sd = new StudentDAOImpl();
        StudentModel sm = new StudentModel();
        sm.setStudent_id(sc.student_id);
            
      
        
        if(sd.delete(sm)){
            return true;
        }
        return false;
    }
}
