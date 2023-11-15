
package model;


public class NoticeModel extends UserModel{
    private int notice_id;
    private String notice_category;
    private String notice_title;
    private String notice_desc;
    private String notice_date;
    private int admin_id;

    public int getNotice_id() {
        return notice_id;
    }

    public void setNotice_id(int notice_id) {
        this.notice_id = notice_id;
    }

    public String getNotice_category() {
        return notice_category;
    }

    public void setNotice_category(String notice_category) {
        this.notice_category = notice_category;
    }

    public String getNotice_title() {
        return notice_title;
    }

    public void setNotice_title(String notice_title) {
        this.notice_title = notice_title;
    }

    public String getNotice_desc() {
        return notice_desc;
    }

    public void setNotice_desc(String notice_desc) {
        this.notice_desc = notice_desc;
    }

    public String getNotice_date() {
        return notice_date;
    }

    public void setNotice_date(String notice_date) {
        this.notice_date = notice_date;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    @Override
    public String toString() {
        return "NoticeModel{" + "notice_id=" + notice_id + ", notice_category=" + notice_category + ", notice_title=" + notice_title + ", notice_desc=" + notice_desc + ", notice_date=" + notice_date + ", admin_id=" + admin_id + '}';
    }
    
    
        
    
}
