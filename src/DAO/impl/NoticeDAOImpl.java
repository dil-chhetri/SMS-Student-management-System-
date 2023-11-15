package DAO.impl;

import DAO.NoticeDAO;
import model.NoticeModel;
import dbconfig.DatabaseConnection;
import java.sql.ResultSet;

public class NoticeDAOImpl implements NoticeDAO {

    public NoticeDAOImpl() {
        DatabaseConnection.getConnection();
    }

    @Override
    public boolean create(NoticeModel sm) {
        boolean status = false;
        try {
            String sql = "INSERT INTO sms_notice(`notice_title`, `notice_category`, `notice_desc`,"
                    + " `notice_date`, `admin_id`) VALUES('"
                    + sm.getNotice_title() + "',"
                    + "'" + sm.getNotice_category() + "',"
                    + "'" + sm.getNotice_desc() + "',"
                    + "'" + sm.getNotice_date() + "',"
                    +  sm.getAdmin_id() + ")"; // converting string to int
            if (DatabaseConnection.iud(sql) > 0) {
                status = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return status;
    }

    @Override
    public boolean view(NoticeModel sm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean select(NoticeModel sm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(NoticeModel sm) {
         boolean status = false;
        try {
            String sql = "DELETE FROM `sms_notice` WHERE notice_id ='"+sm.getNotice_id()+"'";
            if (DatabaseConnection.iud(sql) > 0) {
                status = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return status;
    }

    @Override
    public boolean update(NoticeModel sm) {
          boolean status = false;
        try {
            String sql = "UPDATE `sms_notice` SET `notice_category`='"+sm.getNotice_category()+"',"
                    + "`notice_title`='"+sm.getNotice_title()+"',`notice_desc`='"+sm.getNotice_desc()+"',"
                    + "`notice_date`='"+sm.getNotice_date()+"' WHERE notice_id ='"+sm.getNotice_id()+"'"; // converting string to int
            if (DatabaseConnection.iud(sql) > 0) {
                status = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return status;
    }

    @Override
    public boolean edit(NoticeModel sm) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
