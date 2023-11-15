package controller;

import DAO.NoticeDAO;
import DAO.impl.NoticeDAOImpl;
import dbconfig.DatabaseConnection;
import java.sql.ResultSet;
import model.NoticeModel;

public class NoticeController {
    public int notice_id;
    public String notice_category;
    public String notice_title;
    public String notice_desc;
    public String notice_date;
    public String admin_id;
    

    public boolean addNotice(NoticeController nc) {
        NoticeDAO nd = new NoticeDAOImpl();
        NoticeModel nm = new NoticeModel();
        
        nm.setNotice_title(nc.notice_title);
        nm.setNotice_category(nc.notice_category);
        nm.setNotice_desc(nc.notice_desc);
        nm.setNotice_date(nc.notice_date);
      
        
        nm.setAdmin_id(3);
        
        if(nd.create(nm)){
            return true;
        }
        return false;
    }

    public ResultSet getNoticeList() {
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM sms_notice";
            rs = DatabaseConnection.select(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    public boolean getNoticeDetails() {
        return true;
    }

    public boolean updateNotice(NoticeController nc) {
        NoticeDAO nd = new NoticeDAOImpl();
        NoticeModel nm = new NoticeModel();
        nm.setNotice_id(nc.notice_id);
        nm.setNotice_title(nc.notice_title);
        nm.setNotice_category(nc.notice_category);
        nm.setNotice_desc(nc.notice_desc);
        nm.setNotice_date(nc.notice_date);
            
        nm.setAdmin_id(3);
        
        if(nd.update(nm)){
            return true;
        }
        return false;
    }

    public boolean deleteNotice(NoticeController nc) {
        
                NoticeDAO nd = new NoticeDAOImpl();
        NoticeModel nm = new NoticeModel();
        nm.setNotice_id(nc.notice_id);
            
      
        
        if(nd.delete(nm)){
            return true;
        }
        return false;
        
    }
}
