
package DAO;
import model.AdminModel;


public interface AdminDAO {
    public abstract boolean create(AdminModel sm);
    public abstract boolean view(AdminModel sm);
    public abstract boolean select(AdminModel sm);
    public abstract boolean delete(AdminModel sm);
    public abstract boolean update(AdminModel sm);
    public abstract boolean edit(AdminModel sm);
    
}
