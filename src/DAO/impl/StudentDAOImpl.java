package DAO.impl;

import DAO.StudentDAO;
import dbconfig.DatabaseConnection;
import model.StudentModel;
import java.sql.Connection;
import java.sql.PreparedStatement; 

public class StudentDAOImpl implements StudentDAO{

   @Override
public boolean create(StudentModel sm) {
    boolean status = false;
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement("INSERT INTO sms_student (first_name, middle_name, last_name, email, reg_no, address, gender, blood_group, dob, academic_background) "
                 + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
        
        pstmt.setString(1, sm.getFirst_name());
        pstmt.setString(2, sm.getMiddle_name());
        pstmt.setString(3, sm.getLast_name());
        pstmt.setString(4, sm.getEmail());
        pstmt.setString(5, sm.getReg_no());
        pstmt.setString(6, sm.getAddress());
        pstmt.setString(7, sm.getGender());
        pstmt.setString(8, sm.getBlood_group());
        pstmt.setString(9, sm.getDob());
        pstmt.setString(10, sm.getAcademic_background());
        
        if (pstmt.executeUpdate() > 0) {
            status = true;
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    return status;
}


    @Override
    public boolean view(StudentModel sm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean select(StudentModel sm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(StudentModel sm) {
          boolean status = false;
        try {
            String sql = "DELETE FROM `sms_student` WHERE student_id ='"+sm.getStudent_id()+"'";
            if (DatabaseConnection.iud(sql) > 0) {
                status = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return status;
    }

@Override
public boolean update(StudentModel sm) {
    boolean status = false;
    try {
        String sql = "UPDATE `sms_student` SET `first_name`=?, `middle_name`=?, `last_name`=?, `email`=?, `reg_no`=?, `address`=?, `gender`=?, `blood_group`=?, `dob`=?, `academic_background`=? WHERE `student_id`=?";
        PreparedStatement pstmt = DatabaseConnection.getConnection().prepareStatement(sql);
        pstmt.setString(1, sm.getFirst_name());
        pstmt.setString(2, sm.getMiddle_name());
        pstmt.setString(3, sm.getLast_name());
        pstmt.setString(4, sm.getEmail());
        pstmt.setString(5, sm.getReg_no());
        pstmt.setString(6, sm.getAddress());
        pstmt.setString(7, sm.getGender());
        pstmt.setString(8, sm.getBlood_group());
        pstmt.setString(9, sm.getDob());
        pstmt.setString(10, sm.getAcademic_background());
        pstmt.setInt(11, sm.getStudent_id());

        if (pstmt.executeUpdate() > 0) {
            status = true;
        }

        pstmt.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    return status;
}

    @Override
    public boolean edit(StudentModel sm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
