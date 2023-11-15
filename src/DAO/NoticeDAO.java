
package DAO;
import model.NoticeModel;


    public interface NoticeDAO{
        public abstract boolean create(NoticeModel sm);
        public abstract boolean view(NoticeModel sm);
        public abstract boolean select(NoticeModel sm);
        public abstract boolean delete(NoticeModel sm);
        public abstract boolean update(NoticeModel sm);
        public abstract boolean edit(NoticeModel sm);
    }
    

